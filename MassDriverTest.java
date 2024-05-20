import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MassDriverTest {

    @Test
    public void SampleTest() {
        assertEquals(0,MassDriver.massdriver(new int[]{1,2,3,1,2,3,4}));
        assertEquals(1,MassDriver.massdriver(new int[]{1,2,3,4,3,4,2}));
        assertEquals(-1,MassDriver.massdriver(new int[]{1,2,3,4,5,6,7}));
        assertEquals(-1,MassDriver.massdriver(new int[]{7,6,5,4,3,2,1}));
        assertEquals(2,MassDriver.massdriver(new int[]{1,2,3,4,3,4}));
        assertEquals(0,MassDriver.massdriver(new int[]{5,6,1,2,3,4,3,4,3,2,1,5,6,7}));
        assertEquals(3,MassDriver.massdriver(new int[]{5,6,1,2,3,4,3,4,3,2,7}));
        assertEquals(0,MassDriver.massdriver(new int[]{1,1,3,4,5,6,7}));
        assertEquals(0,MassDriver.massdriver(new int[]{1,2,3,4,3,2,1}));
    }

}