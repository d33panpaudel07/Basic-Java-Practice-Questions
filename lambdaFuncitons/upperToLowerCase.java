package lambdaFuncitons;

import java.util.ArrayList;
import java.util.List;

public class upperToLowerCase {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Hari");
        stringList.add("Sita");

        System.out.println("Original List:");
        for (String string : stringList) {
            System.out.println(string);
        }

        stringList.replaceAll(str -> str.toUpperCase());
        // code below is same as above
        // stringList.replaceAll(String::toUpperCase);

        System.out.println("\nUppercased List:");
        for (String string : stringList) {
            System.out.println(string);
        }
    }

}
