package threads.simpleThreading;

public class concurrencyProblemsExample extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        concurrencyProblemsExample object = new concurrencyProblemsExample();
        object.start();

        System.out.println("\nRunning outside of thread...");
        System.out.println("Amount will be decremented form " + amount-- + " to " + amount);
    }

    public void run() {
        System.out.println("\nRunning from thread...");
        System.out.println("Amount will be incremented from " + amount++ + " to " + amount);
    }
}
