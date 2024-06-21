import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class MadMaxTest {
    @Test
    public void SampleTest () {
        int N = 7;
        int[] a = {1,2,3,4,5,6,7};
        assertArrayEquals(new int[]{1, 2, 3, 7, 6, 5, 4},MadMax.getImpulse(N,a));
    }

    @RepeatedTest(1000)
    public void RepeatedTest () {
        Random rand = new Random();
        int N = 0;
        while (N % 2 == 0) {
            N = rand.nextInt(127)+1;
        }
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = rand.nextInt(256);
        }
        assertArrayEquals(MadMax.getImpulse(N,x),MadMax.getImpulse(N,x));
    }

    @Test
    public void OneNumTest () {
        int N = 1;
        int[] a = {12};
        assertArrayEquals(new int[]{12},MadMax.getImpulse(N,a));
    }

    @Test
    public void MyTest () {
        int N = 13;
        int[] x = {234,212,124,100,98,88,78,67,54,43,32,23,12};
        assertArrayEquals(new int[]{12,23,32,43,54,67,234,212,124,100,98,88,78},MadMax.getImpulse(N,x));
    }

    @Test
    public void PupsTest () {
        int N = 15;
        int[] x = {15,100,249,7,64,50,123,137,200,199,210,240,70,17,1};
        assertArrayEquals(new int[]{1,7,15,17,50,64,70,249,240,210,200,199,137,123,100},MadMax.getImpulse(N,x));
    }

}