package programm;

public class Elephant extends Figure {
    @Override
    public void moveRight(int fromRow, int fromCol, Figure[][] board, int n) {
        int toRow = 0;
        int toCol = 0;
        board[fromRow][fromCol + 2 * n] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            System.out.println("Данного поля не существует!!!");
        }
    }

    @Override
    public void moveLeft(int fromRow, int fromCol, Figure[][] board, int n) {
        int toRow = 0;
        int toCol = 0;
        board[fromRow][fromCol - 2 * n] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            System.out.println("Данного поля не существует!!!");
        }
    }

    @Override
    public void moveHorse(int fromRow, int fromCol, Figure[][] board, int n) {
    }

    @Override
    public String toString() {
        return " E  ";
    }

    @Override
    public void movePawn(int fromRow, int fromCol, Figure[][] board, int n) {
        int toRow = 0;
        int toCol = 0;
        board[fromRow + 2 * n][fromCol] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            System.out.println("Данного поля не существует!!!");
        }
    }
}