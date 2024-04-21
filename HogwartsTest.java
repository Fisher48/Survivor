import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HogwartsTest {

    @Test
    public void SampleTest(){
        assertEquals("яа",Hogwarts.BiggerGreater("ая"));
        assertEquals("нкмл",Hogwarts.BiggerGreater("нклм"));
        assertEquals("ибвк",Hogwarts.BiggerGreater("вкиб"));
        assertEquals("викб",Hogwarts.BiggerGreater("вибк"));
        assertEquals("",Hogwarts.BiggerGreater("fff"));
    }

    @Test
    public void PupsTest(){
        assertEquals("еобн",Hogwarts.BiggerGreater("еноб"));
        assertEquals("jsdhe",Hogwarts.BiggerGreater("jhsed"));
        assertEquals("",Hogwarts.BiggerGreater("оооо"));
        assertEquals("",Hogwarts.BiggerGreater("fff"));
    }

}