import java.util.*;
import static java.lang.Character.isDigit;

public class WhiteWalkers {

    public static final char WALKER = '=';

    public static boolean white_walkers(String village){
        boolean found = false;
        int walkers = 0;
        int curr = 0;
        int prev = 0;
        int sum = 0;
        String s = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < village.length(); i++) {
            if (isDigit(village.charAt(i))) {
                curr = i;
                list.add(village.substring(prev,curr+1));
                prev = curr;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == WALKER) {
                    walkers++;
                }
                if (isDigit(s.charAt(j))) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            }
            if (sum != 10) {
                sum = 0;
                walkers = 0;
                continue;
            }
            if (walkers >= 3) {
                found = true;
            } else {
                found = false;
            }
            sum = 0;
            walkers = 0;
        }
        return found;
    }
}


