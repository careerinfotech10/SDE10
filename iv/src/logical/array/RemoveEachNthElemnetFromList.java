package logical.array;

import java.util.Arrays;
import java.util.List;

public class RemoveEachFourthElemnetFromList {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 5, 6, 8, 9, 11, 1, 4, 5);

        removeEveryNthElementFromList(numberList);

        System.out.println(numberList);

        numberList.removeAll();
    }


    public static  void removeEveryNthElementFromList(List<Integer> numbers)
    {

    }
}
