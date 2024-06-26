import java.util.*;

public class RedBox {

    public static String TheRabbitsFoot(String s, boolean encode) {

        String withoutSpace = s.replace(" ","");
        double sqrtN = Math.sqrt(withoutSpace.length());
        int colum = (int) (sqrtN * 10 % 10);
        int row = (int) (sqrtN);

        if (encode) {

            if (row <= colum) {
                while (row * colum < withoutSpace.length()) {
                    row += 1;
                }
            }
            if (colum <= row) {
                while (row * colum < withoutSpace.length()) {
                    colum += 1;
                }
            }

            char[][] stringToMatrix = new char[row][colum];
            int countChars = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    if (countChars == withoutSpace.length()) {
                        break;
                    }
                    stringToMatrix[i][j] = withoutSpace.charAt(countChars);
                    countChars++;
                }
            }

            countChars = 0;
            char[] decode = new char[withoutSpace.length() + colum];
            for (int i = 0; i < colum; i++) {
                for (int j = 0; j < row; j++) {
                    if (stringToMatrix[j][i] == 0) {
                        break;
                    }
                    decode[countChars] = stringToMatrix[j][i];
                    countChars++;
                    if (countChars == decode.length) {
                        withoutSpace = new String(decode);
                        return withoutSpace;
                    }
                }
                decode[countChars++] = ' ';
            }
            withoutSpace = new String(decode).trim();
            return withoutSpace;

        } else if (!encode) {

            if (row <= colum) {
                while (row * colum < withoutSpace.length()) {
                    row += 1;
                }
            }
            if (colum <= row) {
                while (row * colum < withoutSpace.length()) {
                    colum += 1;
                }
            }

            char[][] stringToMatrix = new char[row][colum];
            int countChars = 0;
            for (int i = 0; i < colum; i++) {
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
                for (int j = 0; j < colum; j++) {
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
        return s;
    }
}


