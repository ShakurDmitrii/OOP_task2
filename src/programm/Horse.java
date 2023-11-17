package programm;

public class Horse extends Figure {

    @Override
    public String toString() {
        return " H  ";
    }

    @Override
    public void moveRight(int fromRow, int fromCol, Figure[][] board, int n) {

    }

    @Override
    public void moveLeft(int fromRow, int fromCol, Figure[][] board, int n) {}
    @Override
    public void movePawn(int fromRow, int fromCol, Figure[][] board, int n) {}
    @Override
    public void moveHorse(int fromRow, int fromCol, Figure[][] board, int n) {
        int toRow = 0;
        int toCol = 0;
        board[fromRow + 2 * n + 1][fromCol + 2 * n] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            board[toRow][toCol] = board[toRow + 1][toCol + 1];
        }
    }
}
