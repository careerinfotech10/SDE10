package logical;

public class NumbersProblems {

    public static void main(String[] args) {

//        reverseNumberByRecursive(91111);
        primeNumbers(5);
    }

    public  static  void primeNumbers(Integer number)
    {
        int count=0;
           for(int i=1;i<=number;i++)
           {
               if(number%i==0) {
                   count++;
               }
           }
        if(count==2)
        {
            System.out.println("Prime Number"+number);
        }
        else
        {
            System.out.println("Not a Prime Number ");
        }
    }
    public static void reverseNumberByLoop(Integer num)
    {
        while (num>0)
        {
            int rev=num%10;
            System.out.print(rev);
            num=num/10;
        }
    }

    public static void reverseNumberByRecursive(Integer num)
    {
        if(num<10 && num>0)
        {
            System.out.print(num);

        }
        else
        {
            System.out.print(num%10);
            reverseNumberByRecursive(num/10);
        }
    }


}
