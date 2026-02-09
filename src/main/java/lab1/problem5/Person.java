package lab1.problem5;

public class Person {
	private final String NAME;
    private final Gender GENDER;

    public Person(String name, Gender gender) {
        this.NAME = name;
        this.GENDER = gender;
    }

    public Gender getGender() {
        return GENDER;
    }

    public String getName() {
        return NAME;
    }
    
    @Override
    public String toString() {
        return NAME + "(" + (GENDER == Gender.BOY ? "B" : "G") + ")";
    }
}
