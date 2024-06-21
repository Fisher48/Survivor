import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TonerConsumptionTest {

    @Test
    public void SampleTest () {
        assertEquals(231,TonerConsumption.getConsumption("First example"));
    }

    @Test
    public void RussianWordsTest () {
        assertEquals(437,TonerConsumption.getConsumption("Пробуем русские слова"));
    }

    @Test
    public void PupsTest () {
        assertEquals(595,TonerConsumption.getConsumption("{Go for a dinner,/ \\ and then went walk}"));
    }
}