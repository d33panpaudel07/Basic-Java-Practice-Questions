package advanceSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// An object that implements the Comparator interface is called a comparator.

// The Comparator interface allows you to create a class with a compare() method that compares two objects to decide which one should go first in a list.

// The compare() method should return a number which is:

//     Negative if the first object should go first in a list.
//     Positive if the second object should go first in a list.
//     Zero if the order does not matter.
public class basicCustomComparator {

    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.addAll(List.of(33, 15, 20, 34, 8, 12));

        Comparator myComparator = new SortEvenFirst();
        Collections.sort(myNumbers, myComparator);

        for (Integer integer : myNumbers) {
            System.out.println(integer);
        }
    }
}

class SortEvenFirst implements Comparator {
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;

        boolean isAEven = (a % 2 == 0);
        boolean isBEven = (b % 2 == 0);

        if (isAEven == isBEven) {
            if (a < b) {
                return -1;
            }
            if (a > b) {
                return 1;
            }
            return 0;
        } else {
            if (isAEven) {
                return -1;
            }
            if (isBEven) {
                return -1;
            }
        }
        return 99;
    }
}
