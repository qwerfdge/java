package ua.brekher.hw1;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c;

        System.out.println("Before exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("\nAfter exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
