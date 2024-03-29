import org.junit.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UnlockPhoneTest {

    @Test
    public void WrongTest () {
        int [] hits = {5,8,6,3};
        int N = hits.length;
        assertEquals("",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void BigTest () {
        int [] hits = {5,2,8,7,3,4,2,6,1,8,3,5,2,9};
        int N = hits.length;
        assertEquals("1548528",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void OneNumbTest () {
        int [] hits = {5};
        int N = hits.length;
        assertEquals("",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void BoardTest () {
        int [] hits = {1,2,3,4,5,6};
        int N = hits.length;
        assertEquals("5",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void ZeroTest () {
        int [] hits = {};
        int N = hits.length;
        assertEquals("",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void SampleTest () {
        int [] hits = {1,2,3,4,5,6,2,7,8,9};
        int N = hits.length;
        assertEquals("982843",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void SmallTest ()  {
        int [] hits = {1,5,2,9};
        int N = hits.length;
        assertEquals("382843",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void ZigTest () {
        int [] hits = {1,8,3,5,1,9};
        int N = hits.length;
        assertEquals("665685",UnlockPhone.PatternUnlock(N,hits));
    }

    @Test
    public void BackTest () {
        int [] hits = {9,2,7,3,4,5,1,6};
        int N = hits.length;
        assertEquals("824264",UnlockPhone.PatternUnlock(N,hits));
    }
}