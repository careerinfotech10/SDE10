public class Main {
    public static void main(String[] args) {

        int numbers[]={4,5,6,7,8,1,8,9};
        int c=0,f=0;
        int k=0;
        int count[]=new int[8];
        for(int i=0;i<numbers.length;i++)
        {
            f=numbers[k];
            if(f==numbers[i])
                c++;
            count[i]=c;
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(count[i]>1){
                System.out.println(numbers[i]+"count int the array="+count[i]);

            }
        }
    }
}