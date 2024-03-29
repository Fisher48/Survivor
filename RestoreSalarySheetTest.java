import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RestoreSalarySheetTest {
    @Test
    public void SampleTest () {
        int N = 3;
        int [] ids = {50,1,1024};
        int [] salary = {20000,100000,90000};
        assertArrayEquals(new int[]{90000,20000,100000},RestoreSalarySheet.SynchronizingTables(N,ids,salary));
    }

    @RepeatedTest(1000)
    public void RepeatedTest () {
        int N = 5;
        int [] ids = {50,1,1024,100,78};
        int [] salary = {110000,45000,78000,90000,124000};
        assertArrayEquals(new int[]{78000,45000,124000,110000,90000},RestoreSalarySheet.SynchronizingTables(N,ids,salary));
    }

    @Test
    public void PupsTest () {
        int N = 20;
        int [] ids = {222,2,50,1,1024,100,234,9,5,3,
                     30,67,90,10,13,54,44,111,190,398};
        int [] salary = {45000,78000,90000,124000,20000,111111,121313,89774,34324,38900,
                         78450,124000,38900,89764,34224,69076,32420,42423,11000,23500};
       assertArrayEquals(new int[]{111111,20000,45000,11000,124000,89764,121313,34224,32420,23500,
                         38900,78000,78450,34324,38900,69076,42423,89774,90000,124000},
                        RestoreSalarySheet.SynchronizingTables(N,ids,salary));
    }

    @RepeatedTest(100)
    public void RandomTest () {
        Random rand = new Random();
        int N = rand.nextInt(50)+1;
        int [] ids = new int[N];
        int [] salary = new int[N];
        for (int i = 0; i < N; i++) {
            ids[i] = rand.nextInt(1000)+1;
            salary[i] = rand.nextInt(100000)+10000;
        }
        assertArrayEquals(RestoreSalarySheet.SynchronizingTables(N,ids,salary),RestoreSalarySheet.SynchronizingTables(N,ids,salary));
    }

}