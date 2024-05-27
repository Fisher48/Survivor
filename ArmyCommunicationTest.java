import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmyCommunicationTest {

    @Test
    public void TwoOnTwoMatrixTest() {
        int n = 2;
        int[][] matrix = {
                {-2,3},
                {8,-9}
        };
        String s = "0 0 2";
        assertEquals(s,ArmyCommunication.army_communication_matrix(n,matrix));
    }

    @Test
    public void SampleTest() {
        int n = 3;
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        String s = "1 1 2";
        assertEquals(s,ArmyCommunication.army_communication_matrix(n,matrix));
    }

    @Test
    public void Sample2Test() {
        int n = 4;
        int[][] matrix = {
                {1,9,2,3},
                {4,8,5,6},
                {0,7,1,2},
                {0,0,0,0}
        };
        String s = "1 0 3";
        assertEquals(s,ArmyCommunication.army_communication_matrix(n,matrix));
    }

    @Test
    public void Matrix6on6Test() {
        int n = 6;
        int[][] matrix = {
                {-1,-9,-7,-2,-3,-2},
                {-44,-34,5,14,61,-10},
                {-22,-67,11,18,22,-12},
                {-11,-32,12,24,21,-8},
                {-1,-45,-24,-32,-89,-20},
                {-4,-8,-5,-14,-6,-10},
        };
        String s = "2 1 3";
        assertEquals(s,ArmyCommunication.army_communication_matrix(n,matrix));
    }

    @Test
    public void MatrixSixOnSixTest() {
        int n = 6;
        int[][] matrix = {
                {-921,-65,-232,-33,-100,-200},
                {-200,-29,-25, 32, 100, 200},
                {-250,-91,-23, 321, 100, 20},
                {-100,-67,-67, 333, 100, 110},
                {300,89,-92, 33, 100, 67},
                {123,921,-222,-300,-100,-200}
        };
        String s = "0 4 2";
        assertEquals(s,ArmyCommunication.army_communication_matrix(n,matrix));
    }

}