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
        assertEquals(true,ListSizeAndPalindrom.palindrom("оно"));
        assertEquals(false,ListSizeAndPalindrom.palindrom("123211"));
        assertEquals(false,ListSizeAndPalindrom.palindrom("Привет"));
        assertEquals(true,ListSizeAndPalindrom.palindrom("radar"));
        assertEquals(false,ListSizeAndPalindrom.palindrom("16787761"));
        assertEquals(true,ListSizeAndPalindrom.palindrom("12321"));
        assertEquals(true,ListSizeAndPalindrom.palindrom("38283"));
        assertEquals(true,ListSizeAndPalindrom.palindrom("11111"));
    }

}