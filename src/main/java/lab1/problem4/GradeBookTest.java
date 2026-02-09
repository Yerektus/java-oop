package lab1.problem4;

import practice2.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Basics of OOP: classes, objects, encapsulation, inheritance, polymorphism.",
                5,
                "None"
        );

        List<Student> students = Arrays.asList(
                new Student("Student A", "1"),
                new Student("Student B", "4"),
                new Student("Student C", "12"),
                new Student("Student D", "87"),
                new Student("Student E", "23"),
                new Student("Student F", "31"),
                new Student("Student G", "44"),
                new Student("Student H", "55"),
                new Student("Student I", "66"),
                new Student("Student J", "77")
        );

        GradeBook gradeBook = new GradeBook(course, students);

        gradeBook.displayMessage();
        System.out.println("Please, input grades for students:\n");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);

            while (true) {
                System.out.print(s.getName() + ": ");
                String token = sc.nextLine().trim();

                try {
                    int grade = Integer.parseInt(token);
                    if (grade < 0 || grade > 100) {
                        System.out.println("Grade must be between 0 and 100. Try again.");
                        continue;
                    }
                    gradeBook.setGrade(i, grade);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter an integer 0..100.");
                }
            }
        }

        System.out.println();
        gradeBook.displayGradeReport();

        sc.close();
    }
}