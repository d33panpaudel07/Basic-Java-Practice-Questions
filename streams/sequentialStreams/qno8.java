package streams.sequentialStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams. 
public class qno8 {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 4, 5, 99, 300, -6);
        Integer secondLargest = intList.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        Integer secondSmallest = intList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("Original List: ");
        ListPrinter.printList(intList);
        System.out.println("Second largest value is: " + secondLargest);
        System.out.println("Second smallest value is: " + secondSmallest);

    }
}
