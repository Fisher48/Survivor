import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UfoSignalsTest {

    @Test
    public void SampleTest() {
        int[] matrix = {1234, 1777};
        int N = matrix.length;
        assertArrayEquals(new int[] {4660, 6007},UfoSignals.UFO(N,matrix,false));
        assertArrayEquals(new int[] {668,1023},UfoSignals.UFO(N,matrix,true));
    }

    @Test
    public void ManyNumbsFalseOctaDecimalTest() {
        int[] matrix = {123, 17, 56473, 123624, 12305623, 12, 7, 56432211, 65544332};
        int N = matrix.length;
        assertArrayEquals(new int[] {83, 15, 23867, 42900, 2722707, 10, 7, 12203145, 14076122},UfoSignals.UFO(N,matrix,true));
    }

    @Test
    public void ManyNumbsTrueHexaDecimalTest() {
        int[] matrix = {18923, 1987, 5648973, 12362894, 23056892, 12, 87, 64322811, 54438932};
        int N = matrix.length;
        assertArrayEquals(new int[] {100643, 6535, 90474867, 305539220, 587557010, 18, 135, 1681008657, 1413712178},UfoSignals.UFO(N,matrix,false));
    }

    @Test
    public void DiffTest() {
        int[] matrix = {34022102, 623};
        int N = matrix.length;
        assertArrayEquals(new int[] {872554754, 1571},UfoSignals.UFO(N,matrix,false));
        assertArrayEquals(new int[] {7349314, 403},UfoSignals.UFO(N,matrix,true));
    }

    @Test
    public void PupsOctaDecimalTest() {
        int[] matrix = {631527430};
        int N = matrix.length;
        assertArrayEquals(new int[] {107392792},UfoSignals.UFO(N,matrix,true));
    }

    @Test
    public void PupsHexaDecimalTest() {
        int[] matrix = {1523670};
        int N = matrix.length;
        assertArrayEquals(new int[] {22165104},UfoSignals.UFO(N,matrix,false));
    }
}