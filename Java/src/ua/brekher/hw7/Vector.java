package ua.brekher.hw7;

import java.util.Arrays;
import java.util.Random;

public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector calculateCrossProduct(Vector vector) {
        double newX = y * vector.z - z * vector.y;
        double newY = z * vector.x - x * vector.z;
        double newZ = x * vector.y - y * vector.x;
        return new Vector(newX, newY, newZ);
    }

    public double calculateCosineAngle(Vector vector) {
        double dotProduct = x * vector.x + y * vector.y + z * vector.z;
        double magnitudeProduct = calculateLength() * vector.calculateLength();
        return dotProduct / magnitudeProduct;
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector subtract(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] generateRandomVectors(int N) {
        Random rand = new Random();
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            double randomX = rand.nextDouble();
            double randomY = rand.nextDouble();
            double randomZ = rand.nextDouble();
            vectors[i] = new Vector(randomX, randomY, randomZ);
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);
        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        System.out.println("Length of Vector1: " + vector1.calculateLength());
        System.out.println("Cross Product: " + vector1.calculateCrossProduct(vector2));
        System.out.println("Cosine Angle: " + vector1.calculateCosineAngle(vector2));
        System.out.println("Vector Sum: " + vector1.add(vector2));
        System.out.println("Vector Difference: " + vector1.subtract(vector2));
        int N = 5;
        Vector[] randomVectors = Vector.generateRandomVectors(N);
        System.out.println("Random Vectors: " + Arrays.toString(randomVectors));
    }
}
