import org.junit.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListSizeAndPalindromTest {

    @Test
    public void FiveRowList() {
        List<String> five = new ArrayList<>();
        five.add("Первый список");
        five.add("для");
        five.add("проверки");
        five.add("длины");
        five.add("списка");
        assertEquals(35,ListSizeAndPalindrom.listLength(five));
    }

    @Test
    public void PalindromNumsTest() {
        assertEquals(true,ListSizeAndPalindrom.checkPalindrom("оно"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrom("123211"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrom("Привет"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrom("radar"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrom("16787761"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrom("12321"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrom("38283"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrom("11111"));
    }

}