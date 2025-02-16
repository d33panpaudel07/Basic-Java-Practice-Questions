package lambdaFuncitons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class sortingListOfStrings {
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Jack", "John", "Jenny", "Apple", "Mango");

        // code below references testList to namesList so modifying testList will modify
        // namesList aswell
        List<String> testList = namesList;

        // code below will actually create a new list
        // List<String> testList = new ArrayList<>(namesList);

        // ASCENDING ORDER
        // testList.sort((str1, str2) -> str1.compareTo(str2));
        // testList.sort(String::compareTo);

        // DESCENDING ORDER
        // testList.sort((s1, s2) -> s2.compareTo(s1));
        // other approach for descending
        testList.sort(Comparator.reverseOrder());

        // System.out.println(namesList);
        System.out.println(testList);
    }
}
