package ua.brekher.hw26;

import static ua.brekher.hw26.Task1.generateRandomArray;

public class Task2 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000, 1, 100);

        int primeCount = countPrimes(array);

        System.out.println("Amount of prime numbers in array: " + primeCount);
    }

    public static int countPrimes(int[] array) {
        int count = 0;

        for (int value : array) {
            if (isPrime(value)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
