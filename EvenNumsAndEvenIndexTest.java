import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumsAndEvenIndexTest {

    @Test
    public void TestEvenNumsList(){
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(5); list.add(4); list.add(7); list.add(10);
        List<Integer> evenNums = new ArrayList<>();
        evenNums.add(2); evenNums.add(4); evenNums.add(10);
        assertEquals(evenNums,EvenNumsAndEvenIndex.evenNums(list));
    }

    @Test
    public void TestEvenIndexList(){
        List<String> list = new ArrayList<>();
        list.add("проверка"); list.add("вывода"); list.add("на"); list.add("экран"); list.add("четных"); list.add("индексов");
        List<String> evenNums = new ArrayList<>();
        evenNums.add("проверка"); evenNums.add("на");evenNums.add("четных");
        assertEquals(evenNums,EvenNumsAndEvenIndex.evenIndex(list));
    }

}