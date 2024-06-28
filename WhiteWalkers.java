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
            for (char symbol : s.toCharArray()) {
                if (symbol == WALKER) {
                    walkers++;
                }
                if (isDigit(symbol)) {
                    sum += Integer.parseInt(String.valueOf(symbol));
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


