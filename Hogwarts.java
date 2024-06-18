import java.util.*;

public class Level1 {

    public static String BiggerGreater(String input) {
        StringBuffer output = new StringBuffer();
        output.append(input);
        List<String> listOfRearrangeWord = new ArrayList<>();
        char[] x = input.toCharArray();
        char temp;
        String s = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                StringBuffer sb = new StringBuffer();
                temp = x[i];
                x[i] = x[j];
                x[j] = temp;
                sb.append(x);
                if (sb.compareTo(output) > 0) {
                    listOfRearrangeWord.add(String.valueOf(sb));
                }
            }
        }
        if (listOfRearrangeWord.isEmpty()) {
            return s;
        }
        Collections.sort(listOfRearrangeWord);
        return listOfRearrangeWord.getFirst();
    }
}


