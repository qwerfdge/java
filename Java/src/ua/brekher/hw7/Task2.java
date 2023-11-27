package ua.brekher.hw7;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    private final double x;
    private final double y;
    private final double z;

    public Task2(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Task2 calculateCrossProduct(Task2 other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Task2(newX, newY, newZ);
    }

    public double calculateCosineAngle(Task2 other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double magnitudeProduct = calculateLength() * other.calculateLength();
        return dotProduct / magnitudeProduct;
    }

    public Task2 add(Task2 other) {
        return new Task2(x + other.x, y + other.y, z + other.z);
    }

    public Task2 subtract(Task2 other) {
        return new Task2(x - other.x, y - other.y, z - other.z);
    }

    public static Task2[] generateRandomVectors(int N) {
        Random rand = new Random();
        Task2[] vectors = new Task2[N];

        for (int i = 0; i < N; i++) {
            double randomX = rand.nextDouble();
            double randomY = rand.nextDouble();
            double randomZ = rand.nextDouble();
            vectors[i] = new Task2(randomX, randomY, randomZ);
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {

        Task2 vector1 = new Task2(1, 2, 3);
        Task2 vector2 = new Task2(4, 5, 6);

        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        System.out.println("Length of Vector1: " + vector1.calculateLength());
        System.out.println("Cross Product: " + vector1.calculateCrossProduct(vector2));
        System.out.println("Cosine Angle: " + vector1.calculateCosineAngle(vector2));
        System.out.println("Vector Sum: " + vector1.add(vector2));
        System.out.println("Vector Difference: " + vector1.subtract(vector2));


        int N = 5;
        Task2[] randomVectors = Task2.generateRandomVectors(N);
        System.out.println("Random Vectors: " + Arrays.toString(randomVectors));
    }
}
