package lab2.problem2;

public class Queen extends Piece {

    public Queen(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        return position.getRow() == newPos.getRow()
                || position.getCol() == newPos.getCol()
                || rowDiff(newPos) == colDiff(newPos);
    }
}