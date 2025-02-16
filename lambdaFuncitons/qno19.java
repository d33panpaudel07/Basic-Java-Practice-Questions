package lambdaFuncitons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 19. Write a Java program to implement a lambda expression to find the second largest and smallest element in an array. 
public class qno19 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 7, 18, 25, 77, 300, 101);
        Integer secLargest = intList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()) // resverse sorting the list to get
                                                   // max values at first
                .skip(1)// skip first so largest is skipped
                .findFirst()// now proceed to find first which is 2nd greatest
                .orElse(null);// happens incase there's only one element in the list

        System.out.println("Second largest element is: " + secLargest);
    }
}
