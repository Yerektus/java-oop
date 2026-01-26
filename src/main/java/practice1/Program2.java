package practice1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the side of the square: ");
		double value = scanner.nextDouble();
		
		double area = value * value;
		double perimeter = 4 * value;
		double diagonal = value * Math.sqrt(value);
		
		System.out.println("Area: " + area);
		System.out.println("Perimetr: " + perimeter);
		System.out.println("Diagoanl: " + diagonal);
		
		scanner.close();
	}
}
