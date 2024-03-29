import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTripTest {

    @Test
    public void SampleTest () {
        int a[] = {10,1,20,2};
        assertEquals(30, MotoTrip.odometer(a));
    }

    @Test
    public void OneNumbTest () {
        int a[] = {1,1,1,1,1,1};
        assertEquals(1, MotoTrip.odometer(a));
    }

    @Test
    public void AccelerationTest () {
        int a[] = {60,3,70,5,100,6};
        assertEquals(420, MotoTrip.odometer(a));
    }

    @Test
    public void ContinueTest () {
        int a[] = {60,3,70,5,70,8};
        assertEquals(530, MotoTrip.odometer(a));
    }

    @Test
    public void ZeroTest () {
        int a[] = {0,0};
        assertEquals(0, MotoTrip.odometer(a));
    }
    @Test
    public void RepeatTest () {
        int a[] = {20,2};
        assertEquals(40, MotoTrip.odometer(a));
    }

    @Test
    public void WrongTest () {
        int a[] = {20,2,30,6,10,7};
        assertEquals(170, MotoTrip.odometer(a));
    }
}