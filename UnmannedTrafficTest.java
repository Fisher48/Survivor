import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnmannedTrafficTest {

    @Test
    public void SampleTest() {
       int [][] track =
               { {3, 5, 5},
                 {5, 2, 2} };
        assertEquals(12, UnmannedTraffic.Unmanned(10, 2, track));
    }

    @Test
    public void MyTest() {
        int [][] track =
                { {3, 5, 5},
                  {5, 2, 2},
                  {7, 4, 4}};
        assertEquals(15, UnmannedTraffic.Unmanned(10, 3, track));
    }

    @Test
    public void NineRoadTest() {
        int [][] track =
                { {4, 4, 4},
                  {8, 3, 3}};
        assertEquals(10, UnmannedTraffic.Unmanned(9, 2, track));
    }

    @Test
    public void PupsTest() {
        int [][] track =
                { {2, 2, 2},
                  {6, 6, 6}};
        assertEquals(10, UnmannedTraffic.Unmanned(10, 2, track));
    }

    @Test
    public void Pups2Test() {
        int [][] track =
                { {2, 6, 6},
                  {5, 5, 5},
                  {9, 3, 3}};
        assertEquals(18, UnmannedTraffic.Unmanned(12, 3, track));
    }

    @Test
    public void DifferTest() {
        int[][] track  ={ {2,5,5},
                          {4,3,3},
                          {8,4,4} };
        assertEquals(15,UnmannedTraffic.Unmanned(10,3,track));
    }

    @Test
    public void aLotOfTrafficLigthsTest() {
        int[][] track  ={ {1,2,2},
                {3,3,3},
                {5,4,4},
                {7,3,3},
                {9,4,4}};
        assertEquals(13,UnmannedTraffic.Unmanned(10,5,track));
    }

}