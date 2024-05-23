import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SpiralTraversalTest {

    private Random rand = new Random();

    @Test
    public void SampleTest() {
        int n = 4;
        int m = 4;
        int[][] matrix1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
        int[] matrix2 = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        assertArrayEquals(matrix2,SpiralTraversal.matrix(m,n,matrix1));
    }

    @RepeatedTest(100)
    public void RandomTest() {
        int n = rand.nextInt(10)+1;
        int m = rand.nextInt(10)+1;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = rand.nextInt(100)+1;
            }
        }
        assertArrayEquals(SpiralTraversal.matrix(m,n,arr),SpiralTraversal.matrix(m,n,arr));
    }
}