package logical;

public class ArraySortingProblems {


    public static void main(String[] args) {
        Integer [] arr={5,4,3,2,1};
        int size=arr.length;
//        sortingBubbleSort(arr,size);

        selectionSort(arr,size);

    }


    private static void printArrays(Integer[] arr) {

        for (Integer integer : arr) {
            System.out.print(integer);
        }
    }

    public static void selectionSort(Integer [] arr,int size)
    {

        for(int i=0;i<size;i++)
        {
               int smallest=i;
               for(int j=i+1;j<size;j++)
               {
                   if(arr[smallest]>arr[j])
                   {
                     smallest=j;
                   }
               }

               int temp=arr[smallest];
               arr[smallest]=arr[i];
               arr[i]=temp;
        }
        printArrays(arr);
    }
    public static void   sortingBubbleSort(Integer arr[],Integer size)
    {
        //
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                System.out.println("");
                System.out.print(arr[j] +" " + arr[j+1]);
                System.out.println();
                if(arr[j]>arr[j+1])
                    {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;

                    }
                System.out.println("--------------");
                System.out.print(arr[j]+"  " + arr[j+1]);

            }
            System.out.println(arr);
        }
        printArrays(arr);
    }
}
