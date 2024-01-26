package ua.brekher.hw14;

public class ReverseThreads {
    public static void main(String[] args) {
        for (int i = 49; i >= 0; i--) {
            int finalI = i;
            Thread thread = new Thread(() -> System.out.println("Hello from thread " + finalI));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("e = " + e.getMessage());
            }
        }
    }
}

