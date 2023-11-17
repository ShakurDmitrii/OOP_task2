package tests;

import org.junit.Test;
import programm.Figure;

import static org.junit.Assert.assertTrue;

public class TestMove {
    private final Figure[][] testBoard;

    public TestMove(Figure[][] testBoard) {
        this.testBoard = testBoard;
    }
    

    @Test
    public void test1() {
        Figure[][] testBoard = new Figure[3][3];
        Figure Pawn = testBoard[0][0];
        testBoard[0][0].movePawn(0, 0, testBoard, 1);

        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < testBoard.length; i++) {
            for (int j = 0; j < testBoard[i].length; j++) {
                if (testBoard[i][j] == Pawn) {
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        Figure res = testBoard[rowIndex][colIndex];
       boolean result;
        if (res == testBoard[1][0]) {
            result = true;
        }
        else result = false;

        assertTrue(result);
    }

}

