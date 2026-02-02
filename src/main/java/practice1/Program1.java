package practice1;

public class Program1 {
	public static void main(String[] args) {
		String name = "aaa";

        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print("|");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println("|");

        System.out.print("+");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
	}
}
