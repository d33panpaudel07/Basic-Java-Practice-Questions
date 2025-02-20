package threads.simpleThreading;

public class implementingRunnableExample implements Runnable {
    public static void main(String[] args) {
        implementingRunnableExample object = new implementingRunnableExample();
        Thread thread = new Thread(object);
        thread.start();
        System.out.println("This code is running outside of the thread.");
    }

    @Override
    public void run() {
        System.out.println("This method implements runnable interface and is running on a thread");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
