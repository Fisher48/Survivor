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
        String temp = s;
        if (s.length() <= 1) {
            return true;
        }
        if (temp.charAt(0) == temp.charAt(s.length()-1)) {
            return palindrom(temp.substring(1,s.length()-1));
        }
        return false;
    }
}


