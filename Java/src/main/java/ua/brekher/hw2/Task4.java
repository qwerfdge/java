package ua.brekher.hw2;

public class Task4 {
    public static void main(String[] args) {
        double num1 = -5;
        double num2 = 7;
        double num3 = 11;

        double result = calculate(num1, num2, num3);
        System.out.println("The smallest by module: " + result);
    }

    public static double calculate(double a, double b, double c) {
        double absA = Math.abs(a);
        double absB = Math.abs(b);
        double absC = Math.abs(c);

        if (absA <= absB && absA <= absC) {
            return a;
        } else if (absB <= absA && absB <= absC) {
            return b;
        } else {
            return c;
        }
    }
}
