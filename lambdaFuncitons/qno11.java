package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// max and min values in a list of integers
public class qno11 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 0, 99, 10, 50, 5);

        System.out.println("Original List: ");
        for (Integer integer : numbersList) {
            System.out.print(integer + "  ");
        }

        // Optional is necessary as max from java stream returns an Optional<T>
        Optional<Integer> maxNum = numbersList.stream()
                .max((x, y) -> x.compareTo(y));
        // Optional<Integer> testMaxNum = numbersList.stream()
        // .max(Integer::compareTo);

        System.out.println();
        // need to use ".orElse" other wise output will be Optional[99]
        // System.out.println("max number is: " + maxNum);
        System.out.println("max number is: " + maxNum.orElse(null));
    }
}
