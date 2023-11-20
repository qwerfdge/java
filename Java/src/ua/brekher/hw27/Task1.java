package ua.brekher.hw27;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = fillArrayWithIndex(3);


        System.out.println("Array before:");
        printArray(array);


        fillNegativeValues(array);

        System.out.println("\nArray after:");
        printArray(array);
    }

    public static int[][] fillArrayWithIndex(int size) {
        int[][] array = new int[size][size];
        int count = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = count++;
            }
        }

        return array;
    }

    public static void fillNegativeValues(int[][] array) {
        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -array[i][j];
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
