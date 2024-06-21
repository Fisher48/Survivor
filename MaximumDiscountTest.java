import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumDiscountTest {

    @Test
    public void SampleTest() {
        int[] prices = {400, 300, 250};
        assertEquals(250,MaximumDiscount.getMaxDiscount(3,prices));
    }

    @Test
    public void Sample2Test() {
        int[] prices = {400, 350, 300, 250, 200, 150, 100};
        assertEquals(450,MaximumDiscount.getMaxDiscount(7,prices));
    }

    @Test
    public void PupsTest() {
        int[] prices = {250, 400, 100, 540, 600, 350, 700};
        assertEquals(790,MaximumDiscount.getMaxDiscount(7,prices));
    }

    @RepeatedTest(100)
    public void RandomTest() {
        Random rand = new Random();
        int N = rand.nextInt(15)+1;
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = rand.nextInt(500)+1;
        }
        assertEquals(MaximumDiscount.getMaxDiscount(N,prices),MaximumDiscount.getMaxDiscount(N,prices));
    }
}