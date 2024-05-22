import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TRCTest {

    private Random rand = new Random();

    @Test
    public void SampleTest() {
        assertArrayEquals(new int[]{0,0,1,1,2},TRC.TRC_sort(new int[]{1,0,1,2,0}));
        assertArrayEquals(new int[]{0,1,2},TRC.TRC_sort(new int[]{2,1,0}));
        assertArrayEquals(new int[]{0,0,1,1,2,2},TRC.TRC_sort(new int[]{0,1,2,1,0,2}));
        assertArrayEquals(new int[]{0,2},TRC.TRC_sort(new int[]{2,0}));
    }

    @RepeatedTest(1000)
    public void RandomTest() {
        int N = rand.nextInt(100) + 1;
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = arr2[i] = rand.nextInt(3);
        }
        Arrays.sort(arr2);
        assertArrayEquals(arr2,TRC.TRC_sort(arr));
    }

}