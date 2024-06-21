import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectionTest {
    String nw = "no winner";

    @Test
    public void MajorityTest () {
        int N = 5;
        int[] votes = {60, 10, 10, 15, 5};
        assertEquals("majority winner 1",Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void MinorityTest () {
        int N = 3;
        int[] votes = {10, 15, 10};
        assertEquals("minority winner 2",Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void NoWinnerTest () {
        int N = 4;
        int[] votes = {111, 111, 110, 110};
        assertEquals(nw,Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void NoWinner2Test () {
        int N = 3;
        int[] votes = {1, 2, 2};
        assertEquals(nw,Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void OneCandidateTest () {
        int N = 1;
        int[] votes = {100};
        assertEquals("majority winner 1",Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void ManyCandidatesTest () {
        int N = 10;
        int[] votes = {100, 60, 10, 10, 15, 5, 55, 42, 11, 312, 312};
        assertEquals(nw,Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void PupsTest () {
        int N = 3;
        int[] votes = {4989, 4998, 7};
        assertEquals("majority winner 2",Election.getWinnerOfElection(N,votes));
    }

    @Test
    public void Pups2Test () {
        int N = 3;
        int[] votes = {4989, 4998, 17};
        assertEquals("minority winner 2",Election.getWinnerOfElection(N,votes));
    }
    @Test
    public void ZeroTest () {
        int N = 2;
        int[] votes = {0,100};
        assertEquals("majority winner 2",Election.getWinnerOfElection(N,votes));
    }
}