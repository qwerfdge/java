package ua.brekher.hw23;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Before exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter exchange:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
