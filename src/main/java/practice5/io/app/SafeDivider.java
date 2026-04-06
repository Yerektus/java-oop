package practice5.io.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first integer: ");
                int x1 = Integer.parseInt(scan.nextLine());
                System.out.print("Enter second integer: ");
                int x2 = Integer.parseInt(scan.nextLine());

                int result = x1 / x2;
                System.out.println("Result: " + x1 + " / " + x2 + " = " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero. Please try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter integers only.");
            }
        }

        scan.close();
    }
}
