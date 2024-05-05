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

    public static boolean palindrom(String s, int start, int end) {
        if (start > end) {
            return true;
        }
        if (s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
            return palindrom(s,start,end);
        }
        return false;
    }
}


