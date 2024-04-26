import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhiteWalkersTest {
    @Test
    public void SamplesTest(){
        assertEquals(true,WhiteWalkers.white_walkers("axxb6===4xaf5===eee5"));
        assertEquals(false,WhiteWalkers.white_walkers("5==ooooooo=5=5"));
        assertEquals(true,WhiteWalkers.white_walkers("abc=7==hdjs=3gg1=======5"));
        assertEquals(false,WhiteWalkers.white_walkers("aaS=8"));
        assertEquals(true,WhiteWalkers.white_walkers("9===1===9===1===9"));
        assertEquals(true,WhiteWalkers.white_walkers("ad3===4sd5===5ds"));
        assertEquals(false,WhiteWalkers.white_walkers("6fg==o=oo3oooo=5=4"));
    }

}