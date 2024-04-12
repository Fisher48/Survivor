import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TankRushTest {

    @Test
    public void WrongSampleTest () {
        assertEquals(true,TankRush.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98"));
    }

    @Test
    public void SampleTest () {
        String S1 = "1234 2345 0987";
        String S2 = "34 98";
        assertEquals(true,TankRush.TankRush(3,4,S1,2,2,S2));
    }

    @Test
    public void Sample2Test () {
        String S1 = "1234 2345 0987";
        String S2 = "32 79";
        assertEquals(false,TankRush.TankRush(3,4,S1,2,2,S2));
    }

    @Test
    public void MatrixThreeonThreeTest () {
        String S1 = "92765 78018 23764 38612";
        String S2 = "018 764 612";
        assertEquals(true,TankRush.TankRush(4,5,S1,3,3,S2));
    }


    @Test
    public void MatrixTwoOnTwoTest () {
        String S1 = "92765 78018 23764 38612";
        String S2 = "37 86";
        assertEquals(true,TankRush.TankRush(4,5,S1,2,2,S2));
    }

    @Test
    public void MatrixFourOnOneTest () {
        String S1 = "92765 78018 23764 38612";
        String S2 = "5 8 4 2";
        assertEquals(true,TankRush.TankRush(4,5,S1,4,1,S2));
    }

    @Test
    public void MatrixOneOnFiveTest () {
        String S1 = "92765 78018 23764 38612";
        String S2 = "23764";
        assertEquals(true,TankRush.TankRush(4,5,S1,1,5,S2));
    }

    @Test
    public void MatrixOneOnOneTest () {
        String S1 = "92765 78038 23764 38632";
        String S2 = "2";
        assertEquals(true,TankRush.TankRush(4,5,S1,1,1,S2));
    }

}