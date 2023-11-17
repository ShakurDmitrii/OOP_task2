import programm.*;

public class HexagonalChess {

    public static void main(String[] args) {
        // Создаем шестиугольную доску с помощью двумерного массива
        Figure[][] board = new Figure[16][16];

        // Заполняем доску пустыми клетками
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                board[i][j] = new Square() {
                };
            }
        }

        // Заполняем доску фигурами

        // Второй ряд

        board[1][9] = new Queen();
        board[2][9] = null;
        board[4][9] = null;
        board[1][11] = new King();

        // Слоны

        board[0][10] = new Elephant();
        board[1][10] = null;
        board[3][10] = null;
        board[5][10] = null;
        board[6][9] = null;
        board[2][11] = null;
        board[4][10] = new Elephant();
        board[4][11] = null;
        board[2][10] = new Elephant();

        // Ладьи

        board[3][7] = new Tower();
        board[3][13] =new Tower();
        board[4][13] = null;

        // Кони

        board[2][8] = new Horse();
        board[3][8] = null;
        board[5][8] = null;
        board[2][12] =new Horse();

        // Пятый ряд

        board[4][6] = new Pawn();
        board[5][7] = new Pawn();
        board[6][8] = new Pawn();
        board[7][9] = new Pawn();

        board[8][10] = new Pawn();
        board[7][10] = null;
        board[7][11] = new Pawn();
        board[6][12] = new Pawn();
        board[5][13] = new Pawn();
        board[3][14] = null;
        board[4][14] = new Pawn();
        // 8 ряд

        board[15][6] = new Pawn();
        board[14][7] = new Pawn();
        board[13][8] = new Pawn();

        board[12][9] = new Pawn();

        board[11][10] = new Pawn();

        board[12][11] = new Pawn();

        board[13][12] = new Pawn();
        board[14][13] = new Pawn();
        board[15][14] = new Pawn();

        System.out.println("Шестиугольные шахматы Глинского:");
        System.out.println("     A     B    C      D     E     F     G     H    I     J     K     L     M      N     O     P   ");
        for (int i = 0; i < 16; i++) {
            System.out.print((i) + " ");
            for (int j = 0; j < 16; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }


        board[14][13].movePawn(14,13,board,1);

        System.out.println("Шестиугольные шахматы Глинского:");
        System.out.println("     A     B    C      D     E     F     G     H    I     J     K     L     M      N     O     P   ");
        for (int i = 0; i < 16; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < 16; j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
       /* board[4][6].move(4,6,board,1);
        board[3][7].move(3,7,board,3);*/
        // Выводим доску на экран



        // Закрываем сканнер
       /* scanner.close();*/

    }

}