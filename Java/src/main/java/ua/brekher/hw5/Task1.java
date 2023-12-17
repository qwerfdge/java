package ua.brekher.hw5;

public class Task1 {

    public static void main(String[] args) {
        int[][] array = fillArrayWithIndex(new int[3][3], false);
        System.out.println("Array before:");
        printArray(array);
        int[][] newArray = fillArrayWithIndex(array, true);
        System.out.println("\nArray after:");
        printArray(newArray);
    }

    public static int[][] fillArrayWithIndex(int[][] array, boolean needNegative) {
        if (needNegative) {
            for (int i = 1; i < array.length; i += 2) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -array[i][j];
                }
            }
        } else {
            int count = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j <  array[i].length; j++) {
                    array[i][j] = count++;
                }
            }
        }
        return array;
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
