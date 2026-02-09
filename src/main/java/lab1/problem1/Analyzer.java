package lab1.problem1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		
		while (true) {
			System.out.print("Enter number (Q to quit): ");
            String token = scanner.next().trim();
            
            if (token.equalsIgnoreCase("Q")) {
            	break;
            }
            
            try {
            	double value = Double.parseDouble(token);
            	data.addValue(value);
            } catch (NumberFormatException e) {
            	System.out.println("Invalid input. Please enter a number or Q to quit.");
            }
		}
		
		System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getLargest());

        scanner.close();
	}
}
