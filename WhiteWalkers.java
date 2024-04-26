import java.util.*;

public class Level1 {

    public static boolean white_walkers(String village){
        boolean find = false;
        int walkers = 0;
        int curr = 0;
        int prev = 0;
        int sum = 0;
        String s = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < village.length(); i++) {
            if (village.charAt(i) >= '0' && village.charAt(i) <= '9') {
                curr = i;
                list.add(village.substring(prev,curr+1));
                prev = curr;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '=') {
                    walkers++;
                }
                if (s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    sum += Integer.parseInt(String.valueOf(s.charAt(j)));
                }
            }
            if (sum != 10) {
                sum = 0;
                walkers = 0;
                continue;
            }
            if (walkers >= 3) {
                find = true;
            } else {
                find = false;
            }
            sum = 0;
            walkers = 0;
        }
        return find;
    }
}


