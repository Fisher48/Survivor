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
        assertEquals("1111",KeyMaster.Keymaker(4));
    }
    @Test
    public void FiveDoors(){
        assertEquals("10101",KeyMaster.Keymaker(5));
    }
    @Test
    public void SixDoors(){
        assertEquals("100011",KeyMaster.Keymaker(6));
    }
    @Test
    public void SevenDoors(){
        assertEquals("1111111",KeyMaster.Keymaker(7));
    }
    @Test
    public void EigthDoors(){
        assertEquals("10101010",KeyMaster.Keymaker(8));
    }
    @Test
    public void NineDoors(){
        assertEquals("100011100",KeyMaster.Keymaker(9));
    }
    @Test
    public void TenDoors(){
        assertEquals("1111111111",KeyMaster.Keymaker(10));
    }
    @Test
    public void ElevenDoors(){
        assertEquals("10101010101",KeyMaster.Keymaker(11));
    }
    @Test
    public void TwelveDoors(){
        assertEquals("100011100011",KeyMaster.Keymaker(12));
    }

}