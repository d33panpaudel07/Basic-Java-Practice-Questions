package streams.sequentialStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class qno3 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenList = numList.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddList = numList.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Original List:");
        ListPrinter.printList(numList);
        System.out.println("Even List:");
        ListPrinter.printList(evenList);
        System.out.println("Odd List:");
        ListPrinter.printList(oddList);

        Integer oddSum = oddList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        Integer evenSum = evenList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.printf("Sum of odd is: " + oddSum);
        System.out.printf("Sum of even is: " + evenSum);
    }
}
