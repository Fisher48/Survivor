import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AiForOksanaTest {

    @Test
    public void Test () {
        int N = 4;
        int [] data = {-50, -35, 90, -25, 100, 10, 90};
        assertEquals(90,AiForOksana.SumOfThe(N,data));
    }

}