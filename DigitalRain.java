import java.util.*;

public class DigitalRain {

    public static String digital_rain(String col){
        StringBuffer sb = new StringBuffer();
        String temp = col;
        int one = 0;
        int zero = 0;
        List<String> maxSubstring = new ArrayList<>();
        for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '1') {
                    one++;
                    sb.append(temp.charAt(i));
                }
                if (temp.charAt(i) == '0') {
                    zero++;
                    sb.append(temp.charAt(i));
                }
                if (i == temp.length() - 1 && one != zero) {
                    i = -1;
                    zero = 0;
                    one = 0;
                    sb.deleteCharAt(0);
                    temp = String.valueOf(sb);
                    sb.delete(0, sb.length());
                } else if (one == zero) {
                    maxSubstring.add(String.valueOf(sb));
                }
        }
        if (maxSubstring.isEmpty()) {
            return "";
        } else {
            return maxSubstring.getLast();
        }
    }
}


