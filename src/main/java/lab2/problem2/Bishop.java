package lab2.problem2;

public class Bishop extends Piece {

    public Bishop(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        return rowDiff(newPos) == colDiff(newPos);
    }
}