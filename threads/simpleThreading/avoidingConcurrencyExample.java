package threads.simpleThreading;

// To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.
public class avoidingConcurrencyExample extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        avoidingConcurrencyExample object = new avoidingConcurrencyExample();
        object.start();

        while (object.isAlive()) {
            System.out.println("Waiting for thread to finish");
        }

        System.out.println("\nRunning outside of thread...");
        System.out.println("(Outside) Amount will be decremented form " + amount-- +
                " to " + amount);
    }

    public void run() {
        System.out.println("\nRunning from thread...");
        System.out.println("(Inside) Amount will be incremented from " + amount++ + " to " + amount);
    }
}
