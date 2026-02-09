package lab1.problem4;

public class Course {
	private final String name;
	private final String description;
	private final int credits;
	private final String prerequisites;
	
	 public Course(String name, String description, int credits, String prerequisites) {
	     this.name = name;
	     this.description = description;
	     this.credits = credits;
	     this.prerequisites = prerequisites;
	 }

	 public String getName() {
		 return name;
	 }

	 public String getDescription() {
		 return description;
	 }

	 public int getCredits() {
		 return credits;
	 }

	 public String getPrerequisites() {
		 return prerequisites;
	 }
	 
	 @Override
	 public String toString() {
	     return name + " (" + credits + " credits)\n"
	             + description + "\n"
	             + "Prerequisites: " + (prerequisites == null || prerequisites.isEmpty() ? "None" : prerequisites);
	 }
}
