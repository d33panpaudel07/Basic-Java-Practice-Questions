package streams.sequentialStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams. 
public class qno5 {
    public static void main(String[] args) {
        String x = "J";
        List<String> strList = Arrays.asList("Rash", "Jack", "John", "Sam", "John");

        // Code below is for storing duplicates in a list
        // Set<String> seen = new HashSet<>();
        // List<String> duplicatesList = strList.stream()
        // .filter(s -> !seen.add(s))
        // .collect(Collectors.toList());

        List<String> matchingString = strList.stream()
                .filter(str -> str.startsWith(x))
                .collect(Collectors.toList());

        ListPrinter.printList(matchingString.stream()
                .distinct()
                .collect(Collectors.toList()));

    }
}
