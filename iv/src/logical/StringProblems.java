package logical;

import java.util.HashMap;

public class StringProblems {

    public static void main(String[] args) {

//    countCharacter("santosh") ;

        String fullName="Santosh";
//        countsDuplicateWords();

//        reverseWordsCharactor(fullName);



//        String str = replaceSpaceWithPeriod(fullName, ' ', ',');
        int length = fullName.length()-10;
        String str = reverseChars(fullName,length);
        System.out.println(str);

    }

    public static void reverseWordsCharactor(String inputStr)
    {
        String[] words = inputStr.split(" ");
        String reversWord="";
        StringBuilder sb=null;
        for(String word:words)
        {
            sb=new StringBuilder();
            reversWord = reversWord+ reverseChars(word,word.length()-1)+" ";
            sb.append(reversWord);
        }
        System.out.println(sb.toString());
    }
    public  static String replaceSpaceWithPeriod(String inputStr,Character oldPeriod,Character newPeriod)
    {
        String finalString="";
        for(int i=0;i<inputStr.length();i++)
        {
                  if(inputStr.charAt(i)==oldPeriod)
                  {
                    finalString+=newPeriod;
                  }
                  else
                  {
                      finalString+=inputStr.charAt(i);
                  }
        }

        return  finalString;
    }
    private static String reverseChars(String word,Integer length) {

        String reversWord="";

        for(int i=length;i>0;i--)
        {
           reversWord+=word.charAt(i);
        }
//        char[] chars = word.toCharArray();
//        for(int i=chars.length-1;i>=0;i--)
//        {
//
//            reversWord=reversWord+chars[i];
//        }

        return reversWord;

    }

    public static HashMap<String,Integer> countsDuplicateWords(String inputStr)
    {
        HashMap<String,Integer> frequencyMap=new HashMap<>();
        String[] words = inputStr.split(" ");
        for(String word:words)
        {
            if(frequencyMap.containsKey(word))
            {
                frequencyMap.put(word,frequencyMap.get(word)+1);
            }
            else
            {
                frequencyMap.put(word,1);
            }
        }
        System.out.println("output map "+frequencyMap);
        return frequencyMap;
    }
    public static HashMap<Character,Integer> countCharacter(String inpuStr)
    {
        HashMap<Character,Integer> charMap=new HashMap<>();
        char[] chars = inpuStr.toCharArray();
        for(char c:chars)
        {
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else {
                charMap.put(c,1);
            }
        }
        System.out.println(charMap);
        return charMap;
    }
}
