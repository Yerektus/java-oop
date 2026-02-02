package practice2;

public class Student {
	private final String name;
	private final String id;
	private int yearOfStudy;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		yearOfStudy = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public int getYearOfStudy() {
		return this.yearOfStudy;
	}
	
	public void incrementYearOfStudy() {
		++this.yearOfStudy;
	}
}
