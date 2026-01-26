package practice1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double valueA = scanner.nextDouble();
		
		System.out.println("Enter b: ");
		double valueB = scanner.nextDouble();
		
		System.out.println("Enter c: ");
		double valueC = scanner.nextDouble();
		
		if (valueA == 0) {
			System.out.println("Error: coefficent 'a' must not be a zero.");
			scanner.close();
			return;
		}
		
		double descriminant = valueB * valueB - 4 * valueA * valueC;
		
		if (descriminant < 0) {
			System.out.println("Error: descriminant is negative. No real roots.");
			scanner.close();
			return;
		}
		
		double sqrtD = Math.sqrt(descriminant);
		double twoA = 2 * valueA;
		
		double x1 = (-valueB + sqrtD) / twoA;
		double x2 = (-valueB - sqrtD) / twoA;
		
		if (descriminant == 0) {
			System.out.println("One real root: ");
			System.out.println("x=" + x1);
		} else {
			System.out.println("Two real roots: ");
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
		
		scanner.close();
	}
}
