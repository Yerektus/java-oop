package lab1.problem4;

public class Course {
	private final String NAME;
	private final String DESCRIPTION;
	private final int CREDITS;
	private final String PREREQUISTES;
	
	 public Course(String name, String description, int credits, String prerequisites) {
	     this.NAME = name;
	     this.DESCRIPTION = description;
	     this.CREDITS = credits;
	     this.PREREQUISTES = prerequisites;
	 }

	 public String getName() {
		 return NAME;
	 }

	 public String getDescription() {
		 return DESCRIPTION;
	 }

	 public int getCredits() {
		 return CREDITS;
	 }

	 public String getPrerequisites() {
		 return PREREQUISTES;
	 }
	 
	 @Override
	 public String toString() {
	     return NAME + " (" + CREDITS + " credits)\n"
	             + PREREQUISTES + "\n"
	             + "Prerequisites: " + (PREREQUISTES == null || PREREQUISTES.isEmpty() ? "None" : PREREQUISTES);
	 }
}
