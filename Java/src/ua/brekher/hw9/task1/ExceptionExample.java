package ua.brekher.hw9.task1;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Example of user exception");
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("I was there!");
        }
    }
}
