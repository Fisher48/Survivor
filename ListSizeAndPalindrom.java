import java.util.*;

public class ListSizeAndPalindrom {

    public static int listLength(List<String> list) {
        int len = 0;
        if (!list.isEmpty()) {
            len = list.getFirst().length();
            list.removeFirst();
            len += listLength(list);
        }
        return len;
    }

    public static boolean palindrom(String word, int start, int end) {
        if (start > end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        } else {
            return palindrom(word,start+1,end-1);
        }
    }

    public static boolean checkPalindrom(String s){
        return palindrom(s,0,s.length()-1);
    }
}


