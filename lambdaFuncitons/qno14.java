package lambdaFuncitons;

import java.util.function.Predicate;

public class qno14 {
    public static void main(String[] args) {
        Predicate<String> checkPalindrome = str -> {
            // StringBuilder returns as StringBuilder object so we have to
            // convert it to string
            String string = new StringBuilder(str).reverse().toString();
            return str.equals(string);
        };

        String word1 = "level";
        boolean result = checkPalindrome.test(word1);
        if (!result) {
            System.out.println("The string is not palindrome.");
            return;
        }
        System.out.println("The string is palindrome.");
    }
}
