package lab2.problem2;

public class Knight extends Piece {

    public Knight(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        int r = rowDiff(newPos);
        int c = colDiff(newPos);
        return (r == 2 && c == 1) || (r == 1 && c == 2);
    }
}