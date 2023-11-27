package ua.brekher.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Array before:");
        printArray(array);

        boolean isDescending = isDescendingOrder(array);

        System.out.println("\nArray after: " + isDescending);
    }

    public static boolean isDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
