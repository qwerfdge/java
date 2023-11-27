package ua.brekher.hw4;

import static ua.brekher.hw4.Task1.generateRandomArray;

public class Task3 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(2000, 1, 100);

        int[] modifiedArray = replaceEvenWithZero(array.clone());

        System.out.println("Array before:");
        printArray(array);

        System.out.println("\nArray after:");
        printArray(modifiedArray);
    }

    public static int[] replaceEvenWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
