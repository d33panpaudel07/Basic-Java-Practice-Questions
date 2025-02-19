package javaCollections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPoc {
    public static void main(String[] args) {
        Set<String> testSet = new HashSet<>();
        // so it is case sensitive and ignores repeated elements
        testSet.addAll(List.of("Jack", "Jenny", "Jack", "jack"));
        Integer index = 1;
        for (String elem : testSet) {
            System.out.println("element " + index + ": " + elem);
        }

        String keyword = "jack";
        System.out.println(testSet.contains(keyword));

    }
}
