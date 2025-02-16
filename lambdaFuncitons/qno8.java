package lambdaFuncitons;

import java.util.function.LongUnaryOperator;

// https://www.geeksforgeeks.org/longunaryoperator-interface-in-java/
public class qno8 {
    public static void main(String[] args) {
        LongUnaryOperator findFactorial = n -> {
            Long result = (long) 1;
            for (Long i = (long) 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        Long number = (long) 7;

        // Like calling a funciton findFactorial but also using it's
        Long factResult = findFactorial.applyAsLong(number);

        System.out.println("The factorial of " + number + " is :" + factResult);
    }
}
