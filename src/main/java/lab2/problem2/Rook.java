package lab2.problem2;

public class Rook extends Piece {

    public Rook(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        return position.getRow() == newPos.getRow()
                || position.getCol() == newPos.getCol();
    }
}