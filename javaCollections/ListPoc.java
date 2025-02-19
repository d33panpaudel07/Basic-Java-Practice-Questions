package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class ListPoc {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        System.out.println("\nAdding to list: ");
        namesList.add("Jack");
        namesList.add("Josh");
        namesList.add("Sarah");
        System.out.println("List: " + namesList);

        // System.out.println("\nAdding to first index -> 1: ");
        // namesList.add(1, "firstIndex");
        // System.out.println("List: " + namesList);

        // System.out.println("\nDisplaying to from index -> 1: ");
        // String specificItem = namesList.get(1);
        // System.out.println(specificItem);

        // System.out.println("\nGet index of data -> (Sarah): ");
        // System.out.println(namesList.indexOf("Sarah"));

        // System.out.println("\nRemoving data -> (firstIndex) from list: ");
        // namesList.remove("firstIndex");
        // System.out.println(namesList);

        System.out.println();
        namesList.add(namesList.size(), "Jack");
        System.out.println(namesList);

        System.out.println("Removing first occurence of -> (Jack): ");
        namesList.remove("Jack");
        System.out.println(namesList);

        for (String name : namesList) {
            System.out.println("Name: " + name);
        }
    }
}
