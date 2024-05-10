import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BastShoe2Test {

    @Test
    public void Sample2Test() {

        String command = "1 Привет";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "2 2";
        assertEquals("Прив", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe2.BastShoe(command));
        command = "5";
        assertEquals("Прив", BastShoe2.BastShoe(command));
    }


    @Test
    public void SampleTest() {
        String command = "1 Привет";
        assertEquals("Привет", BastShoe2.BastShoe(command));
        command = "1 , Мир!";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "1 ++";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "2 2";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!++", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "1 *";
        assertEquals("Привет, Мир!*",BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "4";
        assertEquals("Привет, Мир!", BastShoe2.BastShoe(command));
        command = "3 6";
        assertEquals(",", BastShoe2.BastShoe(command));
        command = "2 100";
        assertEquals("", BastShoe2.BastShoe(command));
    }

}