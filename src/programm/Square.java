package programm;

public class Square extends Figure {
    @Override
    public void moveRight(int fromRow, int fromCol, Figure[][] board, int n) {

            System.out.println("На выбранной клетке нет фигуры!");
    }
    @Override
    public void moveHorse(int fromRow, int fromCol, Figure[][] board, int n) {}
    @Override

    public void moveLeft(int fromRow, int fromCol, Figure[][] board, int n) {

    }
    @Override
    public  String toString() {
        return "    ";
    }
    @Override
    public void movePawn(int fromRow, int fromCol, Figure[][] board, int n) {}
    }
