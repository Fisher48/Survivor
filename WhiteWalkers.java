import java.util.*;
import static java.lang.Character.isDigit;

public class WhiteWalkers {

    private static final char WALKER = '=';

    public static boolean white_walkers(String village){
        int curr = 0;
        int prev = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < village.length(); i++) {
            if (isDigit(village.charAt(i))) {
                curr = i;
                list.add(village.substring(prev,curr+1));
                prev = curr;
            }
        }

        boolean found = false;
        for (String s : list) {
            int sum = 0;
            int walkers = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == WALKER) {
                    walkers++;
                }
                if (isDigit(s.charAt(j))) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            }
            if (sum != 10) {
                continue;
            }
            found = walkers >= 3;
        }
        return found;
    }
}


