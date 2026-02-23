package lab2.problem5;

public class Employee extends Person {
    private final String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public String getOccupation() {
        return "Employee: " + jobTitle;
    }
}

public class PhDStudent extends Student {
    private final String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student: " + researchTopic;
    }

    @Override
    protected boolean canTakeCareOf(Animal animal) {
        return !(animal instanceof Dog);
    }
}