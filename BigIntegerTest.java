import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigIntegerTest {

    @Test
    public void AnotherTest () {
        assertEquals("119122",BigInteger.getDiffOfNumbers("4312", "123434"));
    }

    @Test
    public void MySampleTest () {
        assertEquals("16090968",BigInteger.getDiffOfNumbers("16214124", "123156"));
    }

    @Test
    public void SmallDiffTest () {
        assertEquals("91311",BigInteger.getDiffOfNumbers("123434", "32123"));
    }

    @Test
    public void BigNumbTest () {
        assertEquals("6608201726",BigInteger.getDiffOfNumbers("9821874562", "3213672836"));
    }

    @Test
    public void SampleTest () {
        assertEquals("1234567890",BigInteger.getDiffOfNumbers("1234567891", "1"));
    }

    @Test
    public void SampleTest2 () {
        assertEquals("320",BigInteger.getDiffOfNumbers("1", "321"));
    }

    @Test
    public void EqualTest () {
        assertEquals("0",BigInteger.getDiffOfNumbers("12312332", "12312332"));
    }

    @Test
    public void AlmostSameTest () {
        assertEquals("99999",BigInteger.getDiffOfNumbers("9999999998", "9999899999"));
    }

    @Test
    public void ReverseTest () {
        assertEquals("864197532",BigInteger.getDiffOfNumbers("987654321", "123456789"));
    }

    @Test
    public void ZeroTest () {
        assertEquals("999008999651002",BigInteger.getDiffOfNumbers("999999999891001", "991000239999"));
    }

    @Test
    public void MaxValuesTest () {
        assertEquals("1000000000000000",BigInteger.getDiffOfNumbers("0", "1000000000000000"));
    }

    @Test
    public void ZeroValuesTest () {
        assertEquals("198333359009",BigInteger.getDiffOfNumbers("198342343243", "8984234"));
    }
}