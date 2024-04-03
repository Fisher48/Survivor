import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigIntegerTest {

    @Test
    public void AnotherTest () {
        assertEquals("119122",BigInteger.BigMinus("4312", "123434"));
    }

    @Test
    public void MySampleTest () {
        assertEquals("16090968",BigInteger.BigMinus("16214124", "123156"));
    }

    @Test
    public void SmallDiffTest () {
        assertEquals("91311",BigInteger.BigMinus("123434", "32123"));
    }

    @Test
    public void BigNumbTest () {
        assertEquals("6608201726",BigInteger.BigMinus("9821874562", "3213672836"));
    }

    @Test
    public void SampleTest () {
        assertEquals("1234567890",BigInteger.BigMinus("1234567891", "1"));
    }

    @Test
    public void SampleTest2 () {
        assertEquals("320",BigInteger.BigMinus("1", "321"));
    }

    @Test
    public void EqualTest () {
        assertEquals("0",BigInteger.BigMinus("12312332", "12312332"));
    }

    @Test
    public void AlmostSameTest () {
        assertEquals("99999",BigInteger.BigMinus("9999999998", "9999899999"));
    }

    @Test
    public void ReverseTest () {
        assertEquals("864197532",BigInteger.BigMinus("987654321", "123456789"));
    }

    @Test
    public void ZeroTest () {
        assertEquals("999008999651002",BigInteger.BigMinus("999999999891001", "991000239999"));
    }

    @Test
    public void MaxValuesTest () {
        assertEquals("1000000000000000",BigInteger.BigMinus("0", "1000000000000000"));
    }

    @Test
    public void ZeroValuesTest () {
        assertEquals("198333359009",BigInteger.BigMinus("198342343243", "8984234"));
    }
}