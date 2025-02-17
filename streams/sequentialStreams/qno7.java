package streams.sequentialStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

// 7. Write a Java program to find the maximum and minimum values in a list of integers using streams. 
public class qno7 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 4, 5, 99, 300, -6);

        Integer min = intList.stream()
                .max(Integer::compare)
                .orElse(0);
        Integer max = intList.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println("Original list: ");
        ListPrinter.printList(intList);
        System.out.println("Min val: " + min);
        System.out.println("Max val: " + max);

    }
}
