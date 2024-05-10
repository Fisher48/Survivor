import java.util.*;

public class BracketsGeneration {

    public static List<String> genBrackets(List<String> list, int left, int right, char[] s, int count){
        if (left < 0 || right < left) {
            return list;
        }
        if (left == 0 && right == 0) {
            list.add(String.valueOf(s));
        }
        if (left > 0) {
            s[count] = '(';
            genBrackets(list,left - 1, right, s, count + 1);
        }
        if (right > 0) {
            s[count] = ')';
            genBrackets(list, left, right - 1, s, count + 1);
        }
        return list;
    }

    public static List<String> brackets(int N){
        List<String> list = new ArrayList<>();
        char[] s = new char[N * 2];
        return genBrackets(list, N, N, s, 0);
    }

}


