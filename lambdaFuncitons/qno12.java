package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class qno12 {
    public static void main(String[] args) {
        // List<Integer> nums = Arrays.asList(2, 3, 4);
        // int result = nums.stream().reduce(1, (x, y) -> x * y);
        // if i don't use 1 which is starting value it may return optional object
        // System.out.println(result); // Output: 24 (1 * 2 * 3 * 4)

        List<Integer> intList = Arrays.asList(4, 2, 3, 6, 5, 1);
        System.out.println("Original Array: ");
        for (Integer integer : intList) {
            System.out.print(integer + "  ");
        }
        System.out.println();

        Integer mulResult = intList.stream()
                .reduce(1, (x, y) -> x * y).intValue();
        Integer addResult = intList.stream()
                .reduce(0, (x, y) -> x + y).intValue();

        System.out.println("Multiplied result: " + mulResult);
        System.out.println("Added result: " + addResult);

    }
}
