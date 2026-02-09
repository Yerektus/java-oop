package lab1.problem5;

import java.util.Scanner;

public class GragonLaunchTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DragonLaunch launch = new DragonLaunch();

        System.out.print("Enter line using B/G (example BBGG, GBGB): ");
        String line = sc.nextLine().trim().toUpperCase();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != 'B' && c != 'G') {
                System.out.println("Invalid character: " + c + ". Use only B or G.");
                sc.close();
                return;
            }
            Gender g = (c == 'B') ? Gender.BOY : Gender.GIRL;
            launch.kidnap(new Person("Student" + (i + 1), g));
        }

        boolean dragonEats = launch.willDragonEatOrNot();

        System.out.println(launch);
        System.out.println(dragonEats
                ? "Dragon will have a lunch! People left: " + launch.getKidnapped().size()
                : "No lunch for dragon! Everyone vanished.");

        sc.close();
    }
}
