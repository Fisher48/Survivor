import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTurnTest {

    @Test
    public void SampleTest() {
        String[] matrix = {"123456", "234567", "345678", "456789"};
        String[] matrixAfter = {"212345", "343456", "456767", "567898"};
        String[] turnMatrix;
        turnMatrix = matrix;
        MatrixTurn.MatrixTurn(turnMatrix,4,6,1);
        assertArrayEquals(matrixAfter,turnMatrix);
    }

    @Test
    public void SquareMatrix() {
        String[] matrix2 = {"1234", "2345", "3456", "4567"};
        String[] matrixAfter = {"5432", "6341", "7452", "6543"};
        String[] turnMatrix;
        turnMatrix = matrix2;
        MatrixTurn.MatrixTurn(turnMatrix,4,4,4);
        assertArrayEquals(matrixAfter,turnMatrix);
    }

    @Test
    public void BigMatrix() {
        String[] matrix3 = {"1234567", "2345678", "3456789", "4567893", "1234567"};
        String[] matrixAfter = {"3212345", "4543456", "1656767", "2789878", "3456739"};
        String[] turnMatrix;
        turnMatrix = matrix3;
        MatrixTurn.MatrixTurn(turnMatrix,5,7,2);
        assertArrayEquals(matrixAfter,turnMatrix);
    }

}