package ua.brekher.hw5;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};


        System.out.println("Array before:");
        printArray(array);


        int[][] resultArray = swapRowsAndColumns(array);


        System.out.println("\nArray after:");
        printArray(resultArray);
    }

    public static int[][] swapRowsAndColumns(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int[][] resultArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultArray[j][i] = array[i][j];
            }
        }

        return resultArray;
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
