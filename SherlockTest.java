import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SherlockTest {
    @Test
    public void SampleTest() {
        assertEquals(true,Sherlock.SherlockValidString( "xxyyz"));
        assertEquals(false,Sherlock.SherlockValidString( "xxxyz"));
        assertEquals(false,Sherlock.SherlockValidString( "xyzzz"));
        assertEquals(true,Sherlock.SherlockValidString("xyz"));
        assertEquals(true,Sherlock.SherlockValidString( "xxxyyyzzzaaabbbccc"));
        assertEquals(false,Sherlock.SherlockValidString( "xxxyyyzzzaaabbbcc"));
        assertEquals(false,Sherlock.SherlockValidString( "xxyyza"));
        assertEquals(true,Sherlock.SherlockValidString( "xxyyzza"));
        assertEquals(false,Sherlock.SherlockValidString( "xxyyzabc"));
        assertEquals(true,Sherlock.SherlockValidString("xy"));
        assertEquals(true,Sherlock.SherlockValidString("x"));
        assertEquals(true,Sherlock.SherlockValidString("zzz"));
    }

    @Test
    public void PupsTest() {
        assertEquals(true,Sherlock.SherlockValidString("ccnnmmm"));
        assertEquals(true,Sherlock.SherlockValidString("ddsa"));
        assertEquals(true,Sherlock.SherlockValidString("ffgggtt"));
    }
}