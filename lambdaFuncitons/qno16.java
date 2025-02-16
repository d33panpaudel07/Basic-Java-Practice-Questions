package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;

public class qno16 {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("elem1", "elem2", "elem3", "elem4");
        Boolean result = stringsList.stream().anyMatch(s -> s.equals("elem4"));
        System.out.println(result);
    }

}
