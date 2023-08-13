package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraySearchingProblems {

/*
1.O(1)  Constant
2.O(log n) -Logarthimic
3.O(n) -   Linear complexity O(n)
4.O(n2)- Quadratic
5.O(n3)- Cubic

 */
    public static void main(String[] args) {

        int[] arr={2,4,5,6,8,9,4,9,9,9};
        int size = arr.length-1;
//        findDuplicateElmentWithQaudratic(arr);
//          printHashMap(findDuplicateElmentWithTimeAndSpaceLenear(arr, size));
//          printList(findDuplicatesTimeLeanearAndSpaceConstant(arr,size));
//           searchSecondLargestElement(arr,size,2);
        kthLargetElement(arr,size,2);
    }


    private  static void kthLargetElement(int arr[],int size,int kth)
    {
//        System.out.println(size-kth);
        System.out.println(arr[size-kth]);
    }

    private static void searchSecondLargestElement(int arr[],int size,int nth)
    {
           if(size<2)
           {               System.out.println("atleast 2 element required");

           }
        Arrays.sort(arr);
           for(int i=size-nth;i>=0;i--)
           {
               System.out.println(" i :"+i+" size "+(size));
              if(arr[i]!=arr[size])
              {
                  System.out.println("The third largest element "+arr[i]);
                  return;
              }
           }

        System.out.println("there are no 2nd larget elements ");

    }

    private static void printList(List<Integer> duplicates) {

        duplicates.forEach(item->{
            System.out.println("duplicate items :: "+item);
        });
    }


    public  static List<Integer> findDuplicatesTimeLeanearAndSpaceConstant(int[]nums,int size)
    {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0)
                res.add(Math.abs(nums[index]));
            nums[index]=-nums[index];
        }
        return  res;
    }

    public  static HashMap<Integer,Integer> findDuplicateElmentWithTimeAndSpaceLenear(int []arr,int size)
    {
               HashMap<Integer,Integer> frequency=new HashMap<Integer,Integer>();

               for (int i=0;i<size;i++)
               {
                   if(frequency.containsKey(arr[i]))
                   {
                       frequency.put(arr[i],frequency.get(arr[i])+1);
                   }
                   else
                   {
                       frequency.put(arr[i],1);
                   }
               }



               return  frequency;
    }

    // TimeComplexity O(n2) Quadratic
    public static void findDuplicateElmentWithQaudratic(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is "+arr[j]);
                }
            }
        }
    }
    private static void printHashMap(HashMap<Integer,Integer> inputMap)
    {
        inputMap.forEach((key,value)->{
            System.out.println("Key "+key+" value : "+value);
        });
    }
}



