import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CyberpunkTest {

    private Random rand = new Random();

    @Test
    public void SampleTest() {
        assertEquals(true,Cyberpunk.ECC_help(new int[] {19,3,562,12,114,2},new int[] {562,12,2,3,19,114}));
        assertEquals(false,Cyberpunk.ECC_help(new int[] {1,3,56,12,1,2,3},new int[] {56,12,1,2,2,3,1}));
        assertEquals(false,Cyberpunk.ECC_help(new int[] {1,3,2,3},new int[] {1,2,2,3}));
        assertEquals(false,Cyberpunk.ECC_help(new int[] {1,2,3},new int[] {1,2,3,4}));
        assertEquals(true,Cyberpunk.ECC_help(new int[] {1,2,3},new int[] {1,2,3}));
        assertEquals(true,Cyberpunk.ECC_help(new int[] {1,3,2},new int[] {1,2,3}));
        assertEquals(true,Cyberpunk.ECC_help(new int[] {1,1},new int[] {1,1}));
    }

    @RepeatedTest(100)
    public void RandomTest() {
        int N = rand.nextInt(10) + 1;
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = rand.nextInt(100) + 1;
            arr2[i] = rand.nextInt(100) + 1;
        }
        assertEquals(Arrays.equals(arr1,arr2),Cyberpunk.ECC_help(arr2,arr1));
    }

}