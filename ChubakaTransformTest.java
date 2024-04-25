import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class ChubakaTransformTest {

    @Test
    public void Pups(){
        int N = 7;
        int a[] = {1,7,6,4,3,2,5};
        assertEquals(false,ChubakaTransform.TransformTransform(a,N));
    }

    @RepeatedTest(100)
    public void SampleTest(){
        Random rand = new Random();
        int N = rand.nextInt(10)+1;
        int[] s = new int[N];
        for (int i = 0; i < N; i++){
            s[i] = rand.nextInt(50)+1;
        }
        assertEquals(ChubakaTransform.TransformTransform(s,N),ChubakaTransform.TransformTransform(s,N));
    }

}