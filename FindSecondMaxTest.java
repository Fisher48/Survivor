import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindSecondMaxTest {

    @Test
    public void FindSecondMaxTest(){
        assertEquals(10,FindSecondMax.findSecMax(Arrays.asList(1,8,3,4,10,11)));
        assertEquals(34,FindSecondMax.findSecMax(Arrays.asList(8,4,2,132,34,23,1)));
        assertEquals(9,FindSecondMax.findSecMax(Arrays.asList(7,1,9,3,2,8,9)));
        assertEquals(3,FindSecondMax.findSecMax(Arrays.asList(3,7)));
        assertEquals(5,FindSecondMax.findSecMax(Arrays.asList(5)));
    }

    @RepeatedTest(100)
    public void RandomTest(){
        Random rand = new Random();
        int N = rand.nextInt(100) + 2;
        Integer[] arr = new Integer[N];
        Integer[] arr2 = new Integer[N];
        for (int i = 0; i < N; i++){
            arr[i] = rand.nextInt(10) + 1;
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        assertEquals(arr2[arr2.length-2],FindSecondMax.findSecMax(Arrays.asList(arr)));
    }

}