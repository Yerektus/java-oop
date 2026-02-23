package lab2.problem2;

public class ChessNotation {
    public static Position parseSquare(String s) {
        if (s == null || s.length() != 2) throw new IllegalArgumentException("Use format like e2");

        char file = Character.toLowerCase(s.charAt(0)); 
        char rank = s.charAt(1);                        

        if (file < 'a' || file > 'h') throw new IllegalArgumentException("File must be a-h");
        if (rank < '1' || rank > '8') throw new IllegalArgumentException("Rank must be 1-8");

        int col = file - 'a';
        int row = 8 - (rank - '0');

        return new Position(row, col);
    }
}