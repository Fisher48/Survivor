import java.util.*;

public class WhiteWalkers2 {

    public static boolean walkFind(String village) {
        List<String> list = new ArrayList<>();
        int prev = 0;
        for (int i = 0; i < village.length(); i++) {
            if (village.charAt(i) >= '0' && village.charAt(i) <= '9') {
                list.add(village.substring(prev, i + 1));
                prev = i;
            }
        }

        List<String> filtList = new ArrayList<>();
        for (String s : list) {
            if (s.contains("=")) {
                filtList.add(s);
            }
            if (s.charAt(0) <= '0' || s.charAt(0) >= '9'){
                filtList.remove(s);
            }
        }

        int sum = 0;
        int walkers = 0;
        boolean find = false;
        for (String temp : filtList) {
            if (Integer.parseInt(String.valueOf(temp.charAt(0))) +
                    Integer.parseInt(String.valueOf(temp.charAt(temp.length()-1))) != 10){
                continue;
            }
            sum = 0;
            walkers = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
                    sum += Integer.parseInt(String.valueOf(temp.charAt(i)));
                }
                if (temp.charAt(i) == '=') {
                    walkers++;
                }
            }
            if (walkers < 3) {
                find = false;
            } else {
                find = true;
            }
        }
        return find;
    }
}


