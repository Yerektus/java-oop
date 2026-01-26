package practice1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter initial balance: ");
		double initialBalance = scanner.nextDouble();
		
		System.out.println("Enter initial rate: ");
        double interestRate = scanner.nextDouble();   

        double interest = initialBalance * interestRate / 100;
        double newBalance = initialBalance + interest;

        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + newBalance);
        
        scanner.close();
	}
}
