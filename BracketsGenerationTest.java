import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class BracketsGenerationTest {

    @Test
    public void OneBrackets(){
        List<String> brackets = Arrays.asList("()");
        assertEquals(brackets,BracketsGeneration.getListOfBrackets(1));
    }

    @Test
    public void TwoBracketsTest(){
        List<String> brackets = Arrays.asList("(())", "()()");
        assertEquals(brackets,BracketsGeneration.getListOfBrackets(2));
    }

    @Test
    public void ThreeBracketsTest(){
        List<String> brackets = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(brackets,BracketsGeneration.getListOfBrackets(3));
    }

    @Test
    public void FourBracketsTest(){
        List<String> brackets = Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())",
                "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        assertEquals(brackets,BracketsGeneration.getListOfBrackets(4));
    }

}