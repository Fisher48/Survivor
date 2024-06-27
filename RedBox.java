import java.util.*;

public class RedBox {

    public static String getEncodeString(String s, int col, int row){
        if (row <= col) {
            while (row * col < s.length()) {
                row += 1;
            }
        }
        if (col <= row) {
            while (row * col < s.length()) {
                col += 1;
            }
        }
        char[][] stringToMatrix = new char[row][col];
        int countChars = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (countChars == s.length()) {
                    break;
                }
                stringToMatrix[i][j] = s.charAt(countChars);
                countChars++;
            }
        }
        countChars = 0;
        char[] decode = new char[s.length() + col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (stringToMatrix[j][i] == 0) {
                    break;
                }
                decode[countChars] = stringToMatrix[j][i];
                countChars++;
                if (countChars == decode.length) {
                    s = new String(decode);
                    return s;
                }
            }
            decode[countChars++] = ' ';
        }
        s = new String(decode).trim();
        return s;
    }

    public static String getDecodeString(String s, String withoutSpace, int col, int row) {
        if (row <= col) {
            while (row * col < withoutSpace.length()) {
                row += 1;
            }
        }
        if (col <= row) {
            while (row * col < withoutSpace.length()) {
                col += 1;
            }
        }
        char[][] stringToMatrix = new char[row][col];
        int countChars = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (countChars == s.length()) {
                    break;
                }
                if (s.charAt(countChars) == ' ' && j != row - 1) {
                    stringToMatrix[j][i] = s.charAt(countChars++);
                }
                stringToMatrix[j][i] = s.charAt(countChars);
                countChars++;
            }
        }
        countChars = 0;
        char[] decode = new char[withoutSpace.length()];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (countChars == decode.length) {
                    withoutSpace = new String(decode);
                    return withoutSpace;
                }
                decode[countChars] = stringToMatrix[i][j];
                countChars++;
            }
        }
        withoutSpace = new String(decode).trim();
        return withoutSpace;
    }

    public static String TheRabbitsFoot(String s, boolean encode) {
        String withoutSpace = s.replace(" ","");
        double sqrtN = Math.sqrt(withoutSpace.length());
        int colum = (int) (sqrtN * 10 % 10);
        int row = (int) (sqrtN);
        if (encode) {
            return getEncodeString(withoutSpace, colum, row);
        }
        return getDecodeString(s, withoutSpace, colum, row);
    }
}


