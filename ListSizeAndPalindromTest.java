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
        assertEquals(true,ListSizeAndPalindrom.palindrom("оно",0,2));
        assertEquals(false,ListSizeAndPalindrom.palindrom("123211",0,5));
        assertEquals(false,ListSizeAndPalindrom.palindrom("Привет",0,5));
        assertEquals(true,ListSizeAndPalindrom.palindrom("radar",0,4));
        assertEquals(false,ListSizeAndPalindrom.palindrom("16787761", 0, 7));
        assertEquals(true,ListSizeAndPalindrom.palindrom("12321",0,4));
        assertEquals(true,ListSizeAndPalindrom.palindrom("38283",0,4));
        assertEquals(true,ListSizeAndPalindrom.palindrom("11111",0,4));
    }

}