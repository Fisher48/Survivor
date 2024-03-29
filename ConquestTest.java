import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConquestTest {
    @Test
    public void SampleTest () {
        int N = 3, M = 4, L = 2;
        int[] battalion = {2,2, 3,4};
        assertEquals(3,Conquest.ConquestCampaign(N,M,L,battalion));
    }

    @Test
    public void BigTest () {
        int N = 6, M = 7, L = 3;
        int[] battalion = {2,2, 3,4, 4,4};
        assertEquals(6,Conquest.ConquestCampaign(N,M,L,battalion));
    }

    @Test
    public void SmallTest () {
        int N = 3, M = 2, L = 1;
        int[] battalion = {1,1};
        assertEquals(4,Conquest.ConquestCampaign(N,M,L,battalion));
    }

    @Test
    public void SameTest () {
        int N = 4, M = 5, L = 2;
        int[] battalion = {3,3, 3,3};
        assertEquals(5,Conquest.ConquestCampaign(N,M,L,battalion));
    }
}