package utilities;

import java.util.Arrays;
import java.util.List;

public class DBUtility {

  public  static List<Employee>  getEmployees()
    {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1L, "John", 45000L, "HR"),
                new Employee(2L, "JOY", 45000L, "HR"),
                new Employee(3L, "AB", 45000L, "HR"),
                new Employee(4L, "CD", 45000L, "HR"),
                new Employee(15L, "GH", 45000L, "TX"),
                new Employee(16L, "IH", 45000L, "AD"),
                new Employee(7L, "JK", 45000L, "CA"),
                new Employee(19L, "LM", 45000L, "SOFTWARE"),
                new Employee(18L, "OP", 45000L, "PRODUCT"),
                new Employee(112L, "QR", 45000L, "HR"),
                new Employee(13L, "RS", 45000L, "AC"),
                new Employee(14L, "TQ", 45000L, "IT"),
                new Employee(156L, "MY", 45000L, "IT")

        );

        return employeeList;
    }
}
