package ua.brekher.hw8.task2;

public class Task2 {
    public static void main(String[] args) {

        Pow powFunction = (number, power) -> {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            return result;
        };

        int base = 2;
        int exponent = 3;
        int result = powFunction.pow(base, exponent);

        System.out.println(base + " in power of " + exponent + " equals " + result);
    }

}
