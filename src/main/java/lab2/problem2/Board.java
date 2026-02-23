package lab2.problem2;

public class Board {

    private Piece[][] board = new Piece[8][8];

    public Board() {
        initialize();
    }

    private void initialize() {
        board[0][0] = new Rook(new Position(0,0), false);
        board[0][1] = new Knight(new Position(0,1), false);
        board[0][2] = new Bishop(new Position(0,2), false);
        board[0][3] = new Queen(new Position(0,3), false);
        board[0][4] = new King(new Position(0,4), false);
        board[0][5] = new Bishop(new Position(0,5), false);
        board[0][6] = new Knight(new Position(0,6), false);
        board[0][7] = new Rook(new Position(0,7), false);

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(new Position(1,i), false);
        }

        board[7][0] = new Rook(new Position(7,0), true);
        board[7][1] = new Knight(new Position(7,1), true);
        board[7][2] = new Bishop(new Position(7,2), true);
        board[7][3] = new Queen(new Position(7,3), true);
        board[7][4] = new King(new Position(7,4), true);
        board[7][5] = new Bishop(new Position(7,5), true);
        board[7][6] = new Knight(new Position(7,6), true);
        board[7][7] = new Rook(new Position(7,7), true);

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(new Position(6,i), true);
        }
    }

    public void draw() {
        System.out.println();
        System.out.println("    a b c d e f g h");
        System.out.println("   -----------------");
        for (int r = 0; r < 8; r++) {
            int rank = 8 - r;                 
            System.out.print(rank + " | ");

            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                System.out.print((p == null ? "." : getSymbol(p)) + " ");
            }

            System.out.println("| " + rank);
        }
        System.out.println("   -----------------");
        System.out.println("    a b c d e f g h");
        System.out.println();
        printLegend();
    }

    private void printLegend() {
        System.out.println("Legend (White = uppercase, Black = lowercase):");
        System.out.println("K/k = King, Q/q = Queen, R/r = Rook, B/b = Bishop, N/n = Knight, P/p = Pawn");
        System.out.println("Move format: e2 e4   (from -> to)");
        System.out.println();
    }

    private char getSymbol(Piece p) {
        char s;
        if (p instanceof King) s = 'K';
        else if (p instanceof Queen) s = 'Q';
        else if (p instanceof Rook) s = 'R';
        else if (p instanceof Bishop) s = 'B';
        else if (p instanceof Knight) s = 'N';
        else if (p instanceof Pawn) s = 'P';
        else s = '?';

        return p.isWhite() ? s : Character.toLowerCase(s);
    }

    public boolean move(Position from, Position to) {
        Piece piece = board[from.getRow()][from.getCol()];
        if (piece == null) return false;

        if (!piece.isLegalMove(to)) return false;

        board[to.getRow()][to.getCol()] = piece;
        board[from.getRow()][from.getCol()] = null;
        piece.setPosition(to);
        return true;
    }

    public Piece getAt(Position p) {
        return board[p.getRow()][p.getCol()];
    }
}