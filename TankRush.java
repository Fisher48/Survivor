import java.util.*;

public class Level1 {

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

        boolean isExist = false;

        if (H1 >= H2 && W1 >= W2) {
            StringBuffer[] str2 = new StringBuffer[H2];
            String x = S2.substring(4);
            String[] str22 = S2.split(" ");
            for (int i = 0; i < str22.length-2; i++) {
                str2[i] = new StringBuffer(str22[i+2]);
            }

            StringBuffer[] str1 = new StringBuffer[H1];
            String y = S1.substring(4);
            String[] str11 = S1.split(" ");
            for (int i = 0; i < str11.length-2; i++) {
                str1[i] = new StringBuffer(str11[i+2]);
            }

            for (int i = 0; i <= str1.length - str2.length; i++) {
                int indexOfStr = str1[i].indexOf(String.valueOf(str2[0]));
                while (str1[i].indexOf(String.valueOf(str2[0])) != -1) {
                    for (int j = 1; j < str2.length; j++) {
                        if (str1[i + j].toString().substring(indexOfStr, indexOfStr + str2[0].length()).equals(str2[j].toString())) {
                            isExist = true;
                        } else {
                            isExist = false;
                            break;
                        }
                    }
                    if (!isExist) {
                        String check = str1[i].substring(indexOfStr, indexOfStr + str2[0].length());
                        if (check.equals(x)) {
                            isExist = true;
                        }
                        str1[i].setCharAt(indexOfStr, '.');
                        indexOfStr = str1[i].indexOf(String.valueOf(str2[0]));
                    } else {
                        break;
                    }
                }
                if (isExist) {
                    break;
                }
            }
        }
        return isExist;
    }
}


