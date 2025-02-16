package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 18. Write a Java program to implement a lambda expression to check if a given number is a perfect square. 
public class qno18 {
    public static void main(String[] args) {
        Predicate<Integer> checkSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        Integer n1 = 25, n2 = 5;
        boolean res1 = checkSquare.test(n1);
        boolean res2 = checkSquare.test(n2);
        System.out.printf("Is %d a perfect square? \n%b\n", n1, res1);
        System.out.printf("Is %d a perfect square? \n%b\n", n2, res2);
    }
}
