package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;

public class calculatingAvgDoubles {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(0.0, 10.0, 10.0, 20.0);
        System.out.println("Original List: ");
        for (Double number : doubleList) {
            System.out.println(number);
        }

        Double average = doubleList.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average of the list is: " + average);
    }
}
