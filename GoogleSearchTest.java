import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchTest {

    @Test
    public void PupsTest () {
        int len = 5;
        String s = "Раз два три четыре пять.";
        String sub = "семь";
        assertArrayEquals(new int[] {0,0,0,0,0,0},GoogleSearch.WordSearch(len,s,sub));
    }
    @Test
    public void SampleTest () {
        int len = 12;
        String s = " строка разбивается на набор строк через выравнивание по заданной ширине.";
        String sub = "строк";
        assertArrayEquals(new int[] {0,0,0,1,0,0,0},GoogleSearch.WordSearch(len,s,sub));
    }

    @Test
    public void SmallTest () {
        int len = 6;
        String s = " сегодня пришел заказ можешь забирать.";
        String sub = "заказ";
        assertArrayEquals(new int[] {0,0,0,0,1,0,0,0},GoogleSearch.WordSearch(len,s,sub));
    }

    @Test
    public void BigTest () {
        int len = 10;
        String s = "Строки могут быть очень громадными, чтобы их разбить.";
        String sub = "чтобы";
        assertArrayEquals(new int[] {0,0,0,0,1,0},GoogleSearch.WordSearch(len,s,sub));
    }

    @Test
    public void RepeatTest () {
        int len = 8;
        String s = "Работает, одно слово работает и еще раз работает";
        String sub = "работает";
        assertArrayEquals(new int[] {0,0,0,1,0,0,1},GoogleSearch.WordSearch(len,s,sub));
    }

    @Test
    public void WrongTest () {
        int len = 10;
        String s = "12345";
        String sub = "subs";
        assertArrayEquals(new int[] {0},GoogleSearch.WordSearch(len,s,sub));
    }

    @Test
    public void Wrong2Test () {
        int len = 3;
        String s = "12345";
        String sub = "123";
        assertArrayEquals(new int[] {1,0},GoogleSearch.WordSearch(len,s,sub));
    }
}