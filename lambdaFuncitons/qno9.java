package lambdaFuncitons;

import java.util.function.Predicate;

public class qno9 {
    public static void main(String[] args) {

        Predicate<Integer> checkPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int n = 25;
        boolean isPrimeResult = checkPrime.test(n);
        System.out.println(n + " is prime?: " + isPrimeResult);
    }
}
