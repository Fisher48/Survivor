import java.util.*;

public class ListSizeAndPalindrom {

    public static int getListLength(List<String> list) {
        int len = 0;
        if (!list.isEmpty()) {
            len = list.getFirst().length();
            list.removeFirst();
            len += getListLength(list);
        }
        return len;
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (start > end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        } else {
            return isPalindrome(word,start+1,end-1);
        }
    }

    public static boolean checkPalindrome(String s){
        return isPalindrome(s,0,s.length()-1);
    }
}


