package lab2.problem2;

public class King extends Piece {

    public King(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        return rowDiff(newPos) <= 1 && colDiff(newPos) <= 1;
    }
}