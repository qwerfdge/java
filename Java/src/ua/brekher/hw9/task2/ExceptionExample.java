package ua.brekher.hw9.task2;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception2 e) {
            System.out.println("Caught Exception2 in main(): " + e.getMessage());
        }
    }

    public static void f() throws Exception2 {
        try {
            g();
        } catch (Exception1 e) {
            throw new Exception2("Exception2 occurred in f() after catching Exception1");
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("Exception1 occurred in g()");
    }
}
