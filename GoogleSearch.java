import java.util.*;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        int countOfCharsInSubstring = 0;
        int substringStartIndex = 0;
        int substringEndIndex = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                substringEndIndex = i + 1;
            }
            if (substringStartIndex >= substringEndIndex && countOfCharsInSubstring >= len) {
                list.add(s.substring(substringStartIndex, i));
                substringStartIndex = i;
                countOfCharsInSubstring = 0;
            }
            if (countOfCharsInSubstring >= len && s.charAt(i) != ' ') {
                list.add(s.substring(substringStartIndex, substringEndIndex));
                substringStartIndex = substringEndIndex;
                countOfCharsInSubstring = i - substringEndIndex;
            }
            if (countOfCharsInSubstring >= len) {
                list.add(s.substring(substringStartIndex, substringEndIndex));
                substringStartIndex = substringEndIndex;
                countOfCharsInSubstring = i - substringEndIndex;
            }
            if (i == s.length() - 1) {
                list.add(s.substring(substringStartIndex, i + 1));
            }
            countOfCharsInSubstring++;
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


