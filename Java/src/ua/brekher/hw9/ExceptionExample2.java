package ua.brekher.hw9;

class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Пример пользовательского исключения");
        } catch (CustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: Я был здесь!");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
