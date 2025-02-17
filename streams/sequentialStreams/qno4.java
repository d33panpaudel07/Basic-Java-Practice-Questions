package streams.sequentialStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 4. Write a Java program to remove all duplicate elements from a list using streams. 
public class qno4 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5, 10, 15, 20, 25, 30, 5, 20, 30);
        List<Integer> uniqueList = intList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: ");
        ListPrinter.printList(intList);
        System.out.println("Unique list: ");
        ListPrinter.printList(uniqueList);
    }
}
