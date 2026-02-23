package lab2.problem2;

public abstract class Piece {
    protected Position position;
    protected boolean isWhite;

    public Piece(Position position, boolean isWhite) {
        this.position = position;
        this.isWhite = isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position p) {
        this.position = p;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isLegalMove(Position newPosition);

    protected int rowDiff(Position p) {
        return Math.abs(p.getRow() - position.getRow());
    }

    protected int colDiff(Position p) {
        return Math.abs(p.getCol() - position.getCol());
    }
}