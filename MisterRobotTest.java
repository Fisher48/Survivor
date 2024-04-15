import java.util.*;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

    public class MisterRobotTest {

        @Test
        public void SampleTest() {
            int N = 7;
            int[] matrix = {1,3,4,5,6,2,7};
            assertEquals(true, MisterRobot.MisterRobot(N,matrix));
        }

        @Test
        public void TenTest() {
            int N = 10;
            int[] matrix = {8,10,5,2,6,7,3,4,1,9};
            assertEquals(false,MisterRobot.MisterRobot(N,matrix));
        }

        @Test
        public void ReverseTest() {
            int N = 10;
            int[] matrix = {10,9,8,7,6,5,4,3,2,1};
            assertEquals(false,MisterRobot.MisterRobot(N,matrix));
        }


        @Test
        public void PupsTest() {
            int N = 9;
            int[] matrix = {1,3,5,2,4,6,7,8,9};
            int[] matrix1 = {1,4,5,6,7,2,3,9,8};
            int[] matrix2 = {1,6,5,4,2,3,7,8,9};
            int[] matrix3 = {5,6,2,3,4,7,1,8,9};
            assertEquals(true,MisterRobot.MisterRobot(N, matrix3));
            assertEquals(false,MisterRobot.MisterRobot(N, matrix));
            assertEquals(false,MisterRobot.MisterRobot(N, matrix1));
            assertEquals(false,MisterRobot.MisterRobot(N, matrix2));
        }

        @RepeatedTest(100)
        public void RandomTenTest() {
            Random rand = new Random();
            int N = 10;
            int [] matrix = new int[N];
            int x = 0;
            boolean s = false;
            for (int i = 0; i < N; i ++){
                x = rand.nextInt(N) + 1;
                s = false;
                while(!(s)) {
                    s = true;
                    for (int j = 0; j < N; j ++) {
                        if (x == matrix[j]) {
                            s = false;
                            x = rand.nextInt(N) + 1;
                            break;
                        }
                    }
                }
                matrix[i] = x;
            }
            assertEquals(MisterRobot.MisterRobot(N,matrix),MisterRobot.MisterRobot(N,matrix));
        }

        @RepeatedTest(100)
        public void RandomFifteenTest() {
            Random rand = new Random();
            int N = 15;
            int [] matrix = new int[N];
            int x = 0;
            boolean s = false;
            for (int i = 0; i < N; i ++){
                x = rand.nextInt(N) + 1;
                s = false;
                while(!(s)) {
                    s = true;
                    for (int j = 0; j < N; j ++){
                        if(x == matrix[j]) {
                            s = false;
                            x = rand.nextInt(N)+1;
                            break;
                        }
                    }
                }
                matrix[i] = x;
            }
            assertEquals(MisterRobot.MisterRobot(N,matrix),MisterRobot.MisterRobot(N,matrix));
        }
}