package streams.sequentialStreams;

import java.util.Arrays;
import java.util.List;

//  Write a Java program to calculate the average of a list of integers using streams. 
public class qno1 {
    public static void main(String[] args) {
        List<Integer> averageList = Arrays.asList(5, 10, 15, 20);
        Double avgValue = averageList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("The average of the list is: " + avgValue);
    }
}
