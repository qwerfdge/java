package ua.brekher.hw14;

import java.util.concurrent.atomic.AtomicInteger;

public class PrimeNumberCounter {
    private static final AtomicInteger thread1Count = new AtomicInteger(0);
    private static final AtomicInteger thread2Count = new AtomicInteger(0);

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 9, 14, 13, 17, 20, 23, 29};

        Thread thread1 = new Thread(() -> {
            int count = 0;
            for (int num : numbers) {
                if (isPrime(num)) {
                    count++;
                }
            }
            thread1Count.set(count);
            System.out.println("Thread 1 counted: " + count + " primes");
        });

        Thread thread2 = new Thread(() -> {
            int count = 0;
            for (int num : numbers) {
                if (isPrime(num)) {
                    count++;
                }
            }
            thread2Count.set(count);
            System.out.println("Thread 2 counted: " + count + " primes");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("e " + e.getMessage());
        }

        int totalPrimes = thread1Count.get() + thread2Count.get();
        System.out.println("Total primes counted by both threads: " + totalPrimes);
    }
}
