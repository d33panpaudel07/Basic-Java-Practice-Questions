package threads.simpleThreading;

public class extendingThreadsExample extends Thread {
    public static void main(String[] args) {
        extendingThreadsExample threadsExample = new extendingThreadsExample();
        threadsExample.start();
        System.out.println("This code is running outside of a thread.");
    }

    public void run() {
        System.out.println("This code is running on a thread.");
    }
}
