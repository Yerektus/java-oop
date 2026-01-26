package practice1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter word: ");
		String word = scanner.next();
		
		if (isPalindrome(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
        
        scanner.close();
	}
	
	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;
		
		while (left < right) {
			if (word.charAt(right) != word.charAt(left)) {
				return false;
			}
			
			--right;
			++left;
		}
		
		return true;
	}
}
