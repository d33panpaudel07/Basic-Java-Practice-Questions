package threads.simpleThreading;

// 1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
public class qno1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, World");
    }

    public static void main(String[] args) {
        qno1 threadQno1 = new qno1();
        threadQno1.start();
    }
}
