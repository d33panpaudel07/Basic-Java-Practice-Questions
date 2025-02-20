package javaGenerics.basicImplementation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = { 1, 2, 3, 4, 5 };
        System.out.println("Integers are below: ");
        for (Integer integer : intArr) {
            System.out.println(integer);
        }

        List<String> stringList = TestClass.fromArrayToList(intArr, Object::toString);
        System.out.println("Strings are below: ");
        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
