package ua.brekher.hw15;

import java.lang.reflect.Field;

public class Main {

    public static A createInstanceWithModifiedValues(String newId, String newName) {
        A instance = new A();
        try {
            Field idField = A.class.getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(instance, newId);

            Field nameField = A.class.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(instance, newName);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("e " + e.getMessage());
        }
        return instance;
    }

    public static void main(String[] args) {
        A modifiedInstance = createInstanceWithModifiedValues("456", "Modified A");
        System.out.println(modifiedInstance);
    }
}
