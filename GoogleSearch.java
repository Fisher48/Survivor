import java.util.*;

public class GoogleSearch {

    public static int[] WordSearch(int len, String s, String subs) {
        int countOfCharsInSubstr = 0;
        int substringStartIndex = 0;
        int substringEndIndex = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                substringEndIndex = i + 1;
            }
            if (substringStartIndex >= substringEndIndex && countOfCharsInSubstr >= len) {
                list.add(s.substring(substringStartIndex, i));
                substringStartIndex = i;
                countOfCharsInSubstr = 0;
            }
            if (countOfCharsInSubstr >= len && s.charAt(i) != ' ') {
                list.add(s.substring(substringStartIndex, substringEndIndex));
                substringStartIndex = substringEndIndex;
                countOfCharsInSubstr = i - substringEndIndex;
            }
            if (countOfCharsInSubstr >= len) {
                list.add(s.substring(substringStartIndex, substringEndIndex));
                substringStartIndex = substringEndIndex;
                countOfCharsInSubstr = i - substringEndIndex;
            }
            if (i == s.length() - 1) {
                list.add(s.substring(substringStartIndex, i + 1));
            }
            countOfCharsInSubstr++;
        }

        // Данное преобразование при поиске слова, необходимо по условию задачи.
        // Результат работы алгоритма - последовательность целых чисел 1 или 0,
        // которые показывают, имеется ли в соответствующей строке запрошенное слово.
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


