package programm;

import programm.Figure;

public class Queen extends Figure {
    @Override
    public void moveRight(int fromRow, int fromCol, Figure[][] board, int n) {

    }
    @Override
    public void movePawn(int fromRow, int fromCol, Figure[][] board, int n) {}
    @Override
    public void moveHorse(int fromRow, int fromCol, Figure[][] board, int n) {}
    @Override
    public void moveLeft(int fromRow, int fromCol, Figure[][] board, int n) {

    }
    @Override
    public  String toString() {
        return " Q  ";
    }
}
