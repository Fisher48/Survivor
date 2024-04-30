import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeyMasterTest {

    @Test
    public void OneDoor(){
        assertEquals("1",KeyMaster.Keymaker(1));
    }
    @Test
    public void TwoDoors(){
        assertEquals("10",KeyMaster.Keymaker(2));
    }
    @Test
    public void ThreeDoors(){
        assertEquals("100",KeyMaster.Keymaker(3));
    }
    @Test
    public void FourDoors(){
        assertEquals("1001",KeyMaster.Keymaker(4));
    }
    @Test
    public void FiveDoors(){
        assertEquals("10010",KeyMaster.Keymaker(5));
    }
    @Test
    public void SixDoors(){
        assertEquals("100100",KeyMaster.Keymaker(6));
    }
    @Test
    public void SevenDoors(){
        assertEquals("1001000",KeyMaster.Keymaker(7));
    }
    @Test
    public void EigthDoors(){
        assertEquals("10010000",KeyMaster.Keymaker(8));
    }
    @Test
    public void NineDoors(){
        assertEquals("100100001",KeyMaster.Keymaker(9));
    }
    @Test
    public void TenDoors(){
        assertEquals("1001000010",KeyMaster.Keymaker(10));
    }
    @Test
    public void ElevenDoors(){
        assertEquals("10010000100",KeyMaster.Keymaker(11));
    }
    @Test
    public void TwelveDoors(){
        assertEquals("100100001000",KeyMaster.Keymaker(12));
    }
    @Test
    public void FiftyDoors(){
        assertEquals("10010000100000010000000010000000000100000000000010",KeyMaster.Keymaker(50));
    }

}