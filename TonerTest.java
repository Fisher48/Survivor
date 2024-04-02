import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TonerTest {

    @Test
    public void SampleTest () {
        assertEquals(231,Toner.PrintingCosts("First example"));
    }

    @Test
    public void RussianWordsTest () {
        assertEquals(437,Toner.PrintingCosts("Пробуем русские слова"));
    }

    @Test
    public void PupsTest () {
        assertEquals(595,Toner.PrintingCosts("{Go for a dinner,/ \\ and then went walk}"));
    }
}