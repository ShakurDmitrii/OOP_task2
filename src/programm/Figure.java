package programm;

public abstract class Figure {

    public abstract void moveRight(int fromRow, int fromCol, Figure[][] board, int n);
    public abstract void moveLeft(int fromRow, int fromCol, Figure[][] board, int n);
    public abstract void moveHorse(int fromRow, int fromCol, Figure[][] board, int n);
    public abstract void movePawn(int fromRow, int fromCol, Figure[][] board, int n);
}
