package streams.sequentialStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
public class qno2 {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("Test1", "Test2", "test3");
        System.out.println("Original List:");
        for (String string : stringsList) {
            System.out.println(string);
        }

        List<String> lowList = stringsList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        List<String> upperList = stringsList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Lower case: ");
        for (String string : lowList) {
            System.out.println(string);
        }
        System.out.println("Upper case: ");
        for (String string : upperList) {
            System.out.println(string);
        }
    }
}
