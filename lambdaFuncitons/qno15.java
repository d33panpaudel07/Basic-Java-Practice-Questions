package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;

// 15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list. 
public class qno15 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 3, 4, 5, 6, 7);
        // List<Integer> intList = Arrays.asList(2, 2, 3);
        int oddSum = intList.stream().filter(x -> x % 2 != 0).map(x -> x * x).reduce(0, (x, y) -> x + y);
        int evenSum = intList.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
        System.out.println("Sum of squares of odd numbers: " + oddSum);
        System.out.println("Sum of squares of even numbers: " + evenSum);
    }
}
