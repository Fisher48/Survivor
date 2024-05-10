import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitalRainTest {

    @Test
    public void SampleTest() {
        assertEquals("10",DigitalRain.digital_rain("1111011"));
        assertEquals("10",DigitalRain.digital_rain("1011111"));
        assertEquals("111000",DigitalRain.digital_rain("1111000"));
        assertEquals("11101000",DigitalRain.digital_rain("11101000"));
        assertEquals("",DigitalRain.digital_rain("11111111"));
        assertEquals("10",DigitalRain.digital_rain("011111110"));
        assertEquals("110000011110",DigitalRain.digital_rain("0110000011110"));

    }

}