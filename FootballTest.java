import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootballTest {

    @Test
    public void SamplesTest() {

       assertEquals(false,Football.Football(new int[]{1, 2, 3},3));
       assertEquals(true,Football.Football(new int[]{1, 6, 4, 3, 2, 7},6));
       assertEquals(true,Football.Football(new int[]{1, 2, 3, 8, 7, 5, 4},7));
       assertEquals(true,Football.Football(new int[]{1, 2, 7, 5, 3, 8, 9},7));
       assertEquals(true,Football.Football(new int[]{1, 3, 2},3));
       assertEquals(true,Football.Football(new int[]{3, 2, 1},3));
       assertEquals(true,Football.Football(new int[]{1, 7, 5, 3, 9},5));
       assertEquals(false,Football.Football(new int[]{9, 5, 3, 7, 1},5));
       assertEquals(true,Football.Football(new int[]{1, 4, 3, 2, 5},5));
       assertEquals(false,Football.Football(new int[]{5, 6, 3, 2, 1},5));
       assertEquals(true,Football.Football(new int[]{4, 9, 6, 8, 5},5));
       assertEquals(true,Football.Football(new int[]{8, 6, 5, 3, 2},5));
       assertEquals(true,Football.Football(new int[]{1, 7, 6, 4, 9},5));
       assertEquals(false,Football.Football(new int[]{0, 7, 2, 1, 3},5));
       assertEquals(true,Football.Football(new int[]{1, 2, 3, 4, 5, 6},5));
       assertEquals(true,Football.Football(new int[]{1, 2, 6, 4, 3},5));

    }

}