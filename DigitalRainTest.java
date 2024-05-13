import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DigitalRainTest {

    @Test
    public void SampleTest() {
        assertEquals("10001110", DigitalRain2.digital_rain("110001110"));
        assertEquals("0011", DigitalRain2.digital_rain("1111001111"));
        assertEquals("01", DigitalRain2.digital_rain("10111011"));
        assertEquals("111000", DigitalRain2.digital_rain("1111000"));
        assertEquals("11101000", DigitalRain2.digital_rain("11101000"));
        assertEquals("", DigitalRain2.digital_rain("11111111"));
        assertEquals("10", DigitalRain2.digital_rain("011111110"));
        assertEquals("110000011110", DigitalRain2.digital_rain("0110000011110"));
        assertEquals("01", DigitalRain2.digital_rain("0000000001"));
    }

}