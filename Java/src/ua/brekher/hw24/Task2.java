package ua.brekher.hw24;

public class Task2 {
    public static void main(String[] args) {
        double area = calculate(1, 5, 3, 5, 6, 7);
        System.out.println("Area of a triangle: " + area);
    }

    public static double calculate(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }
}
