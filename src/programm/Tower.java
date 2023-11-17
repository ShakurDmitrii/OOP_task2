package programm;

import programm.Figure;
import programm.Square;

public class Tower extends Figure {
    @Override
    public void moveRight(int fromRow, int fromCol, Figure[][] board, int n) {

        int toRow = 0;
        int toCol = 0;
        board[fromRow + n][fromCol + n] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            System.out.println("Данного поля не существует!!!");
        }
    }

    @Override
    public void movePawn(int fromRow, int fromCol, Figure[][] board, int n) {
        int toRow = 0;
        int toCol = 0;
        board[fromRow + n][fromCol] = this;
        board[fromRow][fromCol] = new Square();
        if (board[toRow][toCol] == null) {
            System.out.println("Данного поля не существует!!!");
        }
    }
        @Override
        public void moveLeft ( int fromRow, int fromCol, Figure[][] board,int n){
            int toRow = 0;
            int toCol = 0;
            board[fromRow - n][fromCol + n] = this;
            board[fromRow][fromCol] = new Square();
            if (board[toRow][toCol] == null) {
                System.out.println("Данного поля не существует!!!");
            }
        }
        @Override
        public void moveHorse ( int fromRow, int fromCol, Figure[][] board,int n){
        }
        @Override
        public String toString () {
            return " T  ";
        }
    }