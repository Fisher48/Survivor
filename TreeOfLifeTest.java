import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TreeOfLifeTest {

    @Test
    public void SampleFourYearsTest(){
        String[] tree = {".+..", "..+.", ".+.."};
        int N = 12;
        int row = 3;
        int column = 4;
        String[] result = {".+..", "..+.", ".+.."};
        assertArrayEquals(result,TreeOfLife.TreeOfLife(row,column,N,tree));
    }

    @Test
    public void MatrixTreeOnFiveTest(){
        String[] tree = {"..+.+", "+...+", ".+.+."};
        int N = 3;
        int row = 3;
        int column = 5;
        String[] result = {"+++++", "+++++", "+++++"};
        assertArrayEquals(result,TreeOfLife.TreeOfLife(row,column,N,tree));
    }

    @Test
    public void MatrixTreeOnTreeTest(){
        String[] tree = {"..+", "+..", ".+."};
        int N = 5;
        int row = 3;
        int column = 3;
        String[] result = {"+++", "+++", "+++"};
        assertArrayEquals(result,TreeOfLife.TreeOfLife(row,column,N,tree));
    }

    @Test
    public void MatrixFiveOnFiveTest() {
        String[] tree = {"..+..", "+..+.", "++..+", "...+.", "+.+.+"};
        int N = 6;
        int row = 5;
        int column = 5;
        String[] result = {"....+", ".....", ".....", ".....", "....."};
        assertArrayEquals(result, TreeOfLife.TreeOfLife(row, column, N, tree));
    }

    @Test
    public void MatrixFiveOnFourTest() {
        String[] tree =
                {"..+..",
                        "..+..",
                        "+.+.+",
                        "+...."};
        int N = 4;
        int row = 4;
        int column = 5;
        String[] result = {"..+..",
                ".+++.",
                "+++.+",
                "++..."};
        assertArrayEquals(result, TreeOfLife.TreeOfLife(row, column, N, tree));
    }
}