package lab1.problem4;

import java.util.ArrayList;
import java.util.List;

import practice2.Student;

public class GradeBook {
	private final Course course;
	private final List<Student> students;
	private final List<Integer> grades;
	
	public GradeBook(Course course) {
		this.course = course;
		this.students = new ArrayList<>();
		this.grades = new ArrayList<>();
	}
	
	public GradeBook(Course course, List<Student> students) {
		this(course);
		for (Student s : students) {
			addStudent(s);
		}
	}
	
	public void addStudent(Student student) {
        students.add(student);
        grades.add(null);
    }
	
	public void setGrade(int studentIndex, int grade) {
		grades.set(studentIndex, grade);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for " + course.getName() + "!\n");
	}
	
	public void displayGradeReport() {
        double avg = determineClassAverage();
        Student lowStudent = getLowestGradeStudent();
        Student highStudent = getHighestGradeStudent();

        int low = getLowestGrade();
        int high = getHighestGrade();

        System.out.printf("Class average is %.2f. ", avg);

        if (lowStudent != null) {
            System.out.println("Lowest grade is " + low + " (" + lowStudent.getName() + ", id: " + lowStudent.getId() + ").");
        } else {
            System.out.println("Lowest grade is N/A.");
        }

        if (highStudent != null) {
            System.out.println("Highest grade is " + high + " (" + highStudent.getName() + ", id: " + highStudent.getId() + ").");
        } else {
            System.out.println("Highest grade is N/A.");
        }

        System.out.println();
        outputBarChart();
    }
	
	public double determineClassAverage() {
		int sum = 0;
		int count = 0;
		for (Integer g : grades) {
			if (g != null) {
				sum += g;
				++count;
			}
		}
		
		return (count == 0) ? 0.0 : (double) sum / count;
	}
	
	public int getLowestGrade() {
        Integer min = null;
        for (Integer g : grades) {
            if (g == null) continue;
            if (min == null || g < min) min = g;
        }
        return (min == null) ? 0 : min;
    }
	
	public int getHighestGrade() {
        Integer max = null;
        for (Integer g : grades) {
            if (g == null) continue;
            if (max == null || g > max) max = g;
        }
        return (max == null) ? 0 : max;
    }
	
	public Student getLowestGradeStudent() {
        Integer min = null;
        int idx = -1;
        for (int i = 0; i < grades.size(); i++) {
            Integer g = grades.get(i);
            if (g == null) continue;
            if (min == null || g < min) {
                min = g;
                idx = i;
            }
        }
        return (idx == -1) ? null : students.get(idx);
	}
	
	public Student getHighestGradeStudent() {
        Integer max = null;
        int idx = -1;
        for (int i = 0; i < grades.size(); i++) {
            Integer g = grades.get(i);
            if (g == null) continue;
            if (max == null || g > max) {
                max = g;
                idx = i;
            }
        }
        return (idx == -1) ? null : students.get(idx);
	}
	
	public void outputBarChart() {
		System.out.println("Grades distribution");
		
		int[] freq = new int[11];
		
		for (Integer g : grades) {
			if (g == null) continue;
			int grade = Math.max(0, Math.min(100, g));
			if (grade == 100) ++freq[10];
			else ++freq[grade / 10];
		}
		
		for (int range = 0; range < freq.length; ++range) {
			if (range == 10) {
				System.out.print("100:   ");
			} else {
				int start = range * 10;
				int end = start + 9;
				System.out.printf("%02d-%02d: ", start, end);
			}
			
			for (int star = 0; star < freq[range]; star++) {
	            System.out.print("*");
	        }
			System.out.println();
		}
	}
	
	@Override
    public String toString() {
        return "GradeBook for course:\n" + course + "\nStudents: " + students.size();
    }
}
