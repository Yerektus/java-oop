package lab2.problem5;

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