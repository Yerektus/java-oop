package practice2;

public class Program1 {
	public static void main(String[] main) {
		Student student = new Student("Yerdos", "11242");
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getYearOfStudy());
		
		student.incrementYearOfStudy();
		System.out.println(student.getYearOfStudy());
	}
}
