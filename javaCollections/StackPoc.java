package javaCollections;

import java.util.Stack;

public class StackPoc {
    public static void main(String[] args) {
        Stack<String> stackStr = new Stack<>();
        stackStr.push("Item 1");
        stackStr.push("Item 2");
        stackStr.push("Item 3");
        System.out.println("Stack: " + stackStr);

        String topItem = stackStr.pop();
        System.out.println("Top item: " + topItem);
        System.out.println("Stack after pop: " + stackStr);

        String peekStack = stackStr.peek();
        System.out.println("Peek stack: " + stackStr);
        System.out.println("Stack after peek: " + stackStr);
    }
}
