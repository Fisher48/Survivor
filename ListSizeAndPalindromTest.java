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
        assertEquals(35,ListSizeAndPalindrom.getListLength(five));
    }

    @Test
    public void PalindromNumsTest() {
        assertEquals(true,ListSizeAndPalindrom.checkPalindrome("оно"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrome("123211"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrome("Привет"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrome("radar"));
        assertEquals(false,ListSizeAndPalindrom.checkPalindrome("16787761"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrome("12321"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrome("38283"));
        assertEquals(true,ListSizeAndPalindrom.checkPalindrome("11111"));
    }

}