import java.util.*;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        int countW = 0;
        int countI = 0;
        int countE = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countE = i + 1;
            }
            if (countI >= countE && countW >= len) {
                list.add(s.substring(countI, i));
                countI = i;
                countW = 0;
            }
            if (countW >= len && s.charAt(i) != ' ') {
                list.add(s.substring(countI, countE));
                countI = countE;
                countW = i - countE;
            }
            if (countW >= len) {
                list.add(s.substring(countI, countE));
                countI = countE;
                countW = i - countE;
            }
            if (i == s.length() - 1) {
                list.add(s.substring(countI, i + 1));
            }
            countW++;
        }

        int[] FindWord = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String[] check = list.get(i).split(" ");
            for (int j = 0; j < check.length; j++) {
                String s1 = check[j];
                if (s1.equals(subs)) {
                    FindWord[i]++;
                }
            }
        }
        return FindWord;
    }
}


