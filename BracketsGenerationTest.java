import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class BracketsGenerationTest {

    @Test
    public void OneBrackets(){
        List<String> brackets = Arrays.asList("()");
        assertEquals(brackets,BracketsGeneration.brackets(1));
    }

    @Test
    public void TwoBracketsTest(){
        List<String> brackets = Arrays.asList("(())", "()()");
        assertEquals(brackets,BracketsGeneration.brackets(2));
    }

    @Test
    public void ThreeBracketsTest(){
        List<String> brackets = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(brackets,BracketsGeneration.brackets(3));
    }

    @Test
    public void FourBracketsTest(){
        List<String> brackets = Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())",
                "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        assertEquals(brackets,BracketsGeneration.brackets(4));
    }

}