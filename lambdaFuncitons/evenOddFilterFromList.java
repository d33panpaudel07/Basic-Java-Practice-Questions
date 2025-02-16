package lambdaFuncitons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class evenOddFilterFromList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Integer[] testArray = { 11, 23, 98, 34, 15, 32, 42, 80, 99, 100, 11 };
        for (Integer integer : testArray) {
            integers.add(integer);
        }

        System.out.println("Original Numbers: ");
        for (Integer integer : integers) {
            System.out.print(integer + "  ");
        }

        List<Integer> evenIntegers = new ArrayList<>();
        List<Integer> oddIntegers = new ArrayList<>();
        Set<Integer> testOddIntegers = new HashSet<>();

        oddIntegers = integers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        evenIntegers = integers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        testOddIntegers = integers.stream().filter(num -> num % 2 != 0).collect(Collectors.toSet());

        System.out.println("\n");
        System.out.println("Odd Numbers: ");
        for (Integer integer : oddIntegers) {
            System.out.print(integer + "  ");
        }
        System.out.println("\n");
        System.out.println("Even Numbers: ");
        for (Integer integer : evenIntegers) {
            System.out.print(integer + "  ");
        }
        System.out.println("\n");
        // apparently set also sors the input numbers well a hashset does anyway
        System.out.println("Set odd Numbers: ");
        for (Integer integer : testOddIntegers) {
            System.out.print(integer + "  ");
        }
    }
}
