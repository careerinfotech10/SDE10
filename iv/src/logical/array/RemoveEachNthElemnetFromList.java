package logical.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEachNthElemnetFromList {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ArrayList<String> numbersList = genData();
        long end = System.currentTimeMillis();
        System.out.println("total tiem taken "+(end-start));
//        System.out.println(numbersList);
    }

    public static ArrayList<String> genData() {
        /* Generate sample data */
        ArrayList<String> test = new ArrayList<String>();
        for (int i = 0; i < 100000; i++) {
            test.add("line " + i);
        }
        test.add("duplicate line");
        return test;
    }

    public static void removeUsingSecondList(ArrayList<String> list) {
        // Adapted from removeUsingRemoveAll
        ArrayList<String> newList = new ArrayList<String>();
        int count = 2;

        for (int i = 0; i < list.size(); i++) {
            if (i % count != 0) {
                newList.add(list.get(i));
            }
        }

        list.clear();
        list.addAll(newList);
    }


    public static void removeUsingIter(ArrayList<String> list) {
        Iterator<String> itr = list.iterator();
        int i = 0;
        while(itr.hasNext()) {
            itr.next();
            if(i % 2 == 0) {
                itr.remove();
            }
            i++;
        }
    }






}
