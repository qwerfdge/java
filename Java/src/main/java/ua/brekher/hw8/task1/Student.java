package ua.brekher.hw8.task1;

public class Student {

    String firstName;
    String lastName;
    String group;
    double averageGrade;

    public Student(String firstName, String lastName, String group, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public double getScholarship() {
        return (averageGrade == 5) ? 100 : 80;
    }
}
