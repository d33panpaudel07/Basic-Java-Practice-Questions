package lambdaFuncitons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list. 
public class qno17 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("apple", "dog", "cat", "ball");
        String longestString = strList.stream().max(Comparator.comparingInt(String::length)).orElse("");
        String shortestString = strList.stream().min(Comparator.comparingInt(String::length)).orElse("");

        System.out.println(longestString);
        System.out.println(shortestString);
    }
}
