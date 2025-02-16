package lambdaFuncitons;

import java.util.function.BiFunction;

// Lambda expression to concatenate 2 strings
public class qno10 {

    public static void main(String[] args) {
        // Bifunciton is an interface introduced in java 8
        // It is a funcitonal interface that takes 3 parameters
        // first is the first parameter type
        // second is the second parameter type
        // third is the returning type
        BiFunction<String, String, String> concatenateStrings = (str1, str2) -> {
            return str1 + str2;
        };

        String str1 = "Hello ";
        String str2 = "World";
        String result = concatenateStrings.apply(str1, str2);
        System.out.println("str1: " + str1 + ", str2: " + str2);
        System.out.println("Final result: " + result);
    }
}
