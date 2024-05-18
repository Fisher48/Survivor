import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MuscleFibersTest {

    private Random rand = new Random();

    @Test
    public void SampleTest() {
        assertEquals(2, MuscleFibers.artificial_muscle_fibers(new int[]{19872,9211,2321,12321,111,1111,111,19872}));
        assertEquals(3, MuscleFibers.artificial_muscle_fibers(new int[]{1,2,3,4,2,2,2,2,3,3,4,4,4}));
        assertEquals(0, MuscleFibers.artificial_muscle_fibers(new int[]{1,2,3,4,5}));
        assertEquals(2, MuscleFibers.artificial_muscle_fibers(new int[]{1,2,3,2,1}));
        assertEquals(2, MuscleFibers.artificial_muscle_fibers(new int[]{1,2,3,2,1,2,4,2,1}));
    }

    @RepeatedTest(100)
    public void RandomTest() {
        int N = rand.nextInt(100)+1;
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(32000)+1;
        }
        assertEquals(MuscleFibers.artificial_muscle_fibers(arr),MuscleFibers.artificial_muscle_fibers(arr));
    }
}