package ua.brekher.hw8.task1;

public class Aspirant extends Student {

    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageGrade, String scientificWork) {
        super(firstName, lastName, group, averageGrade);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (averageGrade == 5) ? 200 : 180;
    }
}
