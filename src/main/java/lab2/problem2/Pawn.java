package lab2.problem2;

public class Pawn extends Piece {

    public Pawn(Position p, boolean isWhite) {
        super(p, isWhite);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        int direction = isWhite ? -1 : 1;

        int rowMove = newPos.getRow() - position.getRow();
        int colMove = Math.abs(newPos.getCol() - position.getCol());

        if (colMove == 0 && rowMove == direction)
            return true;

        if (colMove == 0 &&
                ((isWhite && position.getRow() == 6 && rowMove == -2) ||
                 (!isWhite && position.getRow() == 1 && rowMove == 2)))
            return true;

        if (colMove == 1 && rowMove == direction)
            return true;

        return false;
    }
}