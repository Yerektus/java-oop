package practice4.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Alice",   3.9));
        students.add(new Student("Bob",     3.2));
        students.add(new Student("Diana",   3.7));

        Collections.sort(students);
        System.out.println("Sorted by GPA:");
        for (Student s : students) System.out.println("  " + s);

        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student s : students) System.out.println("  " + s);
    }
}