package lab2.problem2;

public class Position {
    private int row;  
    private int col;  

    public Position(int row, int col) {
        if (row < 0 || row > 7 || col < 0 || col > 7)
            throw new IllegalArgumentException("Invalid board position");
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}