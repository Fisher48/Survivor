import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class ShopaholicTest {

    @Test
    public void SampleTest() {
        int[] prices = {400, 300, 250};
        assertEquals(250,Shopaholic.MaximumDiscount(3,prices));
    }

    @Test
    public void Sample2Test() {
        int[] prices = {400, 350, 300, 250, 200, 150, 100};
        assertEquals(450,Shopaholic.MaximumDiscount(7,prices));
    }

    @Test
    public void PupsTest() {
        int[] prices = {250, 400, 100, 540, 600, 350, 700};
        assertEquals(790,Shopaholic.MaximumDiscount(7,prices));
    }

    @RepeatedTest(100)
    public void RandomTest() {
        Random rand = new Random();
        int N = rand.nextInt(15)+1;
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = rand.nextInt(500)+1;
        }
        assertEquals(Shopaholic.MaximumDiscount(N,prices),Shopaholic.MaximumDiscount(N,prices));
    }
}