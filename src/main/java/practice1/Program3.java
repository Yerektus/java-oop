package practice1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your score: ");
		double value = scanner.nextDouble();
		
		String grade = "";
		
		if (value >= 94.5 && value <= 100) {
			grade += "A";
		} else if (value >= 89.5) {
			grade += "A-";
		} else if (value >= 84.5) {
			grade += "B+";
		} else if (value >= 79.5) {
			grade += "B";
		} else if (value >= 74.5) {
			grade += "B-";
		} else if (value >= 69.5) {
			grade += "C+";
		} else if (value >= 64.5) {
			grade += "C";
		} else if (value >= 59.5) {
			grade += "C-";
		} else if (value >= 0) {
			grade += "F";
		} else {
			grade += "Invalid score";
		}
		
		System.out.println("Your grade is: "+ grade);
		
		scanner.close();
	}
}
