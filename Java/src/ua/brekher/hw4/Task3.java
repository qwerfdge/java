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
        int[] newArray = array.clone();
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                newArray[i] = 0;
            }
        }
        return newArray;
    }


    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
