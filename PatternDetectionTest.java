import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternDetectionTest {

    @Test
    public void SampleTest() {
        assertEquals(true,PatternDetection.LineAnalysis("*..*..*..*..*..*..*"));
    }

    @Test
    public void SampleWrongTest() {
        assertEquals(false,PatternDetection.LineAnalysis("*..*...*..*..*..*..*"));
        assertEquals(false,PatternDetection.LineAnalysis("*..*..*..*..*..**..*"));
    }

    @Test
    public void SampleTrueTest() {
        assertEquals(true,PatternDetection.LineAnalysis("*"));
        assertEquals(true,PatternDetection.LineAnalysis("***"));
        assertEquals(true,PatternDetection.LineAnalysis("*.......*.......*"));
        assertEquals(true,PatternDetection.LineAnalysis("**"));
        assertEquals(true,PatternDetection.LineAnalysis("*.*"));
    }

    @Test
    public void WrongTest() {
        assertEquals(false,PatternDetection.LineAnalysis("..*..*...*..*..*..*..*.."));
        assertEquals(false,PatternDetection.LineAnalysis("*..*..*..*..*..**..*.."));
        assertEquals(true,PatternDetection.LineAnalysis("**..**..**..**..**..**"));
        assertEquals(false,PatternDetection.LineAnalysis("**..*...*..*..*..**"));
    }

}