package ua.brekher.hw2;

public class Task3 {
    public static void main(String[] args) {
        int number = 5;

        if (isEven(number)) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
