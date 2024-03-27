import java.util.*;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        ArrayList<String> list = new ArrayList<>();
        String[] firstString = s.split(" ");
        for (int i = 0; i < firstString.length; i++) {
            if (firstString[i] == "") {
                continue;
            }
            if (i < firstString.length - 1) {
                if (firstString[i].length() + firstString[i + 1].length() <= len) {
                    list.add(firstString[i] + " " + firstString[i + 1]);
                    i++;
                    continue;
                }
                if (firstString[i].length() + firstString[i + 1].length() > len) {
                    list.add(firstString[i]);
                }
            } else if (i > 0) {
                list.add(firstString[i]);
            }
        }

        int[] FindWord = new int[list.size()];
        if (list.isEmpty()) {
            FindWord = new int[]{0};
            return FindWord;
        }
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


