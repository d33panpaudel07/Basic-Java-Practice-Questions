package lambdaFuncitons;

import java.util.Scanner;

public class checkIfStringIsEmpty {
    public interface LambdaFunctionsTest {
        boolean checkEmpty(String string);
    }

    public static void main(String[] args) {
        System.out.println("Enter a string to test if it's empty");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        // String testString = "Ram";

        // so apparently i don't have to do this again like this
        // just calling the funciton without interface is ok
        LambdaFunctionsTest lambdaFunctionsTest = (string -> {
            System.out.println(string.getClass());
            return string.isEmpty();
        });
        boolean result = lambdaFunctionsTest.checkEmpty(userInput);

        System.out.println(result);
    }
}