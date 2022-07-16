package com.career.students.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.career.constants.AppConstants;
import com.career.exception.UserAppException;
import com.career.props.AppProperties;
import com.career.students.entity.Student;
import com.career.students.repo.StudentRepo;
import com.career.util.EmailUtils;

@Service
public class MailerServer {

	@Autowired
	private EmailUtils emailUtils;

	@Autowired
	private AppProperties appProps;

	@Autowired
	private StudentRepo studentRepo;

	Map<String, List<String>> success = new HashMap<String, List<String>>();

	List<String> failedRecipent = new ArrayList<String>();
	List<String> successRecipent = new ArrayList<String>();

	public List<Student> getToEmails() {
		List<Student> findAllEmailByIsContractSentFalse = studentRepo.findAllEmailByIsContractSentFalse();
//		List<String> emails = new ArrayList<String>();
//		if (!findAllEmailByIsContractSentFalse.isEmpty()) {
//			emails = findAllEmailByIsContractSentFalse.stream().map(Student::getEmail).collect(Collectors.toList());
//		}
		return findAllEmailByIsContractSentFalse;

	}

	@Autowired
	ResourceLoader resourceLoader;

	public Map<String, List<String>> triggerEmail(String subject) throws UserAppException {
		List<Student> toEmails = getToEmails();
		for (Student email : toEmails) {
//			boolean sendEmail = sendEmail(email.getEmail(), subject, readUnlockAccEmailBody(email));

			Resource resource = resourceLoader.getResource("classpath:docs.pdf");
			File file = null;
			try {
				file = resource.getFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			boolean sendEmail = emailUtils.sendEmail(email.getEmail(), subject, readUnlockAccEmailBody(email));
			// sendEmailWithAttachments(email.getEmail(), subject,
			// readUnlockAccEmailBody(email), email.getFirstName()+email.getLastName(),
			// file);

			if (sendEmail) {
				successRecipent.add(email.getEmail());
				email.setContractSent(true);
				studentRepo.save(email);
			} else {
				failedRecipent.add(email.getEmail());
			}
		}
		success.put("success", successRecipent);
		success.put("failed", failedRecipent);

		return success;

	}

	private String readUnlockAccEmailBody(Student entity) throws UserAppException {
		StringBuilder sb = new StringBuilder(AppConstants.EMPTY_STR);
		String mailBody = AppConstants.EMPTY_STR;

		String fileName = appProps.getMessages().get(AppConstants.UNLOCK_ACC_EMAIL_BODY_FILE);

		try (InputStream in = getClass().getResourceAsStream("/" + fileName);

				BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			// Use resource
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			br.close();

//			String decryptedPwd = PwdUtils.decryptMsg(entity.getPazzword());

			mailBody = sb.toString();
			mailBody = mailBody.replace(AppConstants.FNAME, entity.getFirstName());
			mailBody = mailBody.replace(AppConstants.LNAME, entity.getLastName());
//			mailBody = mailBody.replace(AppConstants.TEMP_PZZWD, decryptedPwd);
			mailBody = mailBody.replace(AppConstants.EMAIL, entity.getEmail());
		} catch (Exception e) {
//			logger.error(AppConstants.EXCEPTION_OCCURED + e.getMessage(), e);
			throw new UserAppException(e.getMessage());
		}
		return mailBody;
	}

}
