import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AiForOksanaTest {

    @Test
    public void Test () {
        int N = 7;
        int [] data = {-50, -35, 90, -25, 100, 10, 90};
        assertEquals(90,AiForOksana.SumOfThe(N,data));
    }

    @Test
    public void SampleTest () {
        int N = 5;
        int [] data = {10, -25, -45, -35, 5};
        assertEquals(-45,AiForOksana.SumOfThe(N,data));
    }

    @Test
    public void SmallTest () {
        int N = 6;
        int [] data = {12, -18, -65, 5, 75, -45};
        assertEquals(-18,AiForOksana.SumOfThe(N,data));
    }

    @Test
    public void BigTest () {
        int N = 12;
        int [] data = {-400, 100, 135, 838, -57, 200, -50, 230, 560, 200, 45, -125};
        assertEquals(838,AiForOksana.SumOfThe(N,data));
    }

    @Test
    public void PupsTest () {
        int N = 13;
        int [] data = {-76, 89, -12, 136, -23, 557, 198, 98, 160, -12, 57, -34, -24};
        assertEquals(557,AiForOksana.SumOfThe(N,data));
    }

    @Test
    public void PupsTest2 () {
        int N = 9;
        int [] data = {-10, -20, 50, -15, -25, 170, 35, 85, 70};
        assertEquals(170,AiForOksana.SumOfThe(N,data));
    }



}