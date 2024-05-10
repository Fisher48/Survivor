import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WhiteWalkers2Test {

    @Test
    public void SamplesTest(){
        assertEquals(true,WhiteWalkers2.walkFind("axxb6===4xaf5===eee5"));
        assertEquals(false,WhiteWalkers2.walkFind("5==ooooooo=5=5"));
        assertEquals(true,WhiteWalkers2.walkFind("abc=7==hdjs=3gg1=======5"));
        assertEquals(false,WhiteWalkers2.walkFind("aaS=8"));
        assertEquals(true,WhiteWalkers2.walkFind("9===1===9===1===9"));
        assertEquals(true,WhiteWalkers2.walkFind("ad3===4sd5===5ds"));
        assertEquals(false,WhiteWalkers2.walkFind("6fg==o=oo3oooo=5=4"));
        assertEquals(true,WhiteWalkers2.walkFind("6fg==o=oo4oooo=5=4"));
    }

    @Test
    public void TestForReference(){
        assertEquals(true,WhiteWalkersReference.findWlakers("axxb6===4xaf5===eee5"));
        assertEquals(false,WhiteWalkersReference.findWlakers("5==ooooooo=5=5"));
        assertEquals(true,WhiteWalkersReference.findWlakers("abc=7==hdjs=3gg1=======5"));
        assertEquals(false,WhiteWalkersReference.findWlakers("aaS=8"));
        assertEquals(true,WhiteWalkersReference.findWlakers("9===1===9===1===9"));
        assertEquals(true,WhiteWalkersReference.findWlakers("ad3===4sd5===5ds"));
        assertEquals(false,WhiteWalkersReference.findWlakers("6fg==o=oo3oooo=5=4"));
        assertEquals(true,WhiteWalkersReference.findWlakers("6fg==o=oo4oooo=5=4"));
    }

}