package streams.sequentialStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams. 
public class qno6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Zebra", "Ball", "Football");
        List<String> ascendingList = list.stream()
                .sorted().collect(Collectors.toList());
        List<String> descendingList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("-----Original list: ");
        ListPrinter.printList(list);
        System.out.println("-----Ascending list: ");
        ListPrinter.printList(ascendingList);
        System.out.println("-----Descending list: ");
        ListPrinter.printList(descendingList);
    }
}
