import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExponentiationTest {

    @Test
    public void expTwoInFive(){
        assertEquals(32,Exponentiation.expon(2,5));
    }

    @Test
    public void expOneInOne(){
        assertEquals(1,Exponentiation.expon(1,1));
    }

    @Test
    public void expFiveInSix(){
        assertEquals(15625,Exponentiation.expon(5,6));
    }

    @Test
    public void SumOfThe1Digits(){
        assertEquals(1,Exponentiation.sumOfTheDigits(1));
    }

    @Test
    public void SumOfThe6Digits(){
        assertEquals(26,Exponentiation.sumOfTheDigits(278621));
    }

    @Test
    public void SumOfThe5Digits(){
        assertEquals(14,Exponentiation.sumOfTheDigits(13172));
    }

    @Test
    public void SumOfThe9Digits(){
        assertEquals(16,Exponentiation.sumOfTheDigits(211023412));
    }

}