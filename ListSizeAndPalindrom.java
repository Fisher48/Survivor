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

    public static boolean palindrom(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1)) {
            sb.deleteCharAt(s.length()-1);
            sb.deleteCharAt(0);
            return palindrom(sb.toString());
        }
        return false;
    }
}


