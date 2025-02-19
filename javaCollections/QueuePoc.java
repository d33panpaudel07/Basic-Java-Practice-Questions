package javaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePoc {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");

        System.out.println("Queue: " + queue);

        // removes first element
        String firstElem = queue.poll();
        System.out.println("Queue after poll: ");
        for (String str : queue) {
            System.out.print(str + "  ");
        }

        // doesn't remove first element
        String secondElem = queue.peek();
        System.out.println("Queue after peek: ");
        for (String str : queue) {
            System.out.print(str + "  ");
        }
    }
}
