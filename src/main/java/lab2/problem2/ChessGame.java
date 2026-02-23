package lab2.problem2;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);

        while (true) {
            board.draw();

            System.out.print("Your move (e.g., e2 e4) or 'exit': ");
            String a = sc.next();
            if (a.equalsIgnoreCase("exit")) break;

            String b = sc.next();

            try {
                Position from = ChessNotation.parseSquare(a);
                Position to = ChessNotation.parseSquare(b);

                boolean ok = board.move(from, to);
                if (!ok) System.out.println("Illegal move!");
            } catch (Exception e) {
                System.out.println("Input error: " + e.getMessage());
            }
        }
    }
}