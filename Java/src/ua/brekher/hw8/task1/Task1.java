package ua.brekher.hw8.task1;

public class Task1 {

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", "Group 1", 4.5);
        Aspirant aspirant = new Aspirant("Peter", "Petrov", "Group 2", 5, "Scientific Work");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.getScholarship() + " dollar");
        }
    }
}
