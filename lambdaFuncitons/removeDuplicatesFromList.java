package lambdaFuncitons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicatesFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("elem1", "elem2", "elem3", "elem1");
        System.out.println("Original List: ");
        for (String string : list) {
            System.out.println(string);
        }

        List<String> uniqueList = list.stream()
                .distinct().collect(Collectors.toList());
        // or i could use .forEach(uniqueList::add)
        System.out.println("Final List: ");
        for (String string : uniqueList) {
            System.out.println(string);
        }

    }
}
