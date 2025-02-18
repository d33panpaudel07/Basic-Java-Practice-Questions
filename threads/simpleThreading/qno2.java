package threads.simpleThreading;

//  Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20. 
public class qno2 {
    private static final int MAX_NUMBER = 20;
    private static Object lock = new Object();
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (!isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("Even number from thread: " + i);
                isEvenTurn = false;
                lock.notify();
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized(lock){
                while (isEvenTurn) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        });
    }
}
