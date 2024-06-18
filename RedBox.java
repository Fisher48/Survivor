import java.util.*;

public class Level1 {
    public static String TheRabbitsFoot(String s, boolean encode) {

        if (encode) {

            char[] x = s.toCharArray();
            String z = s.replaceAll(" ","");
            int lenStringWithoutSpace = z.length();
            double sqrtN = Math.sqrt(lenStringWithoutSpace);
            int colum = (int) (sqrtN * 10  % 10);
            int row = (int) (sqrtN);

                if (row <= colum) {
                    while (row * colum < lenStringWithoutSpace) {
                        row += 1;
                    }
                }
                if (colum <= row) {
                    while (row * colum < lenStringWithoutSpace) {
                        colum += 1;
                    }
                }

            char[][] matrix = new char[row][colum];
            int countX = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    if (countX == lenStringWithoutSpace) {
                        break;
                    }
                    matrix[i][j] = z.charAt(countX);
                    countX++;
                }
            }

            countX = 0;
            char[] decode = new char[lenStringWithoutSpace + colum];
            for (int i = 0; i < colum; i++) {
                for (int j = 0; j < row; j++) {
                    if (matrix[j][i] == 0) {
                        break;
                    }
                    decode[countX] = matrix[j][i];
                    countX++;
                    if (countX == decode.length) {
                        z = new String(decode);
                        return z;
                    }
                }
                decode[countX++] = ' ';
            }
            z = new String(decode).trim();
            return z;

        } else if (!encode) {

            char[] x = s.toCharArray();
            String z = s.replaceAll(" ","");
            int N = z.length();
            double sqrtN = Math.sqrt(N);
            int colum = (int) (sqrtN * 10  % 10);
            int row = (int) (sqrtN);

            if (row <= colum) {
                while (row * colum < N) {
                    row += 1;
                }
            }
            if (colum <= row) {
                while (row * colum < N) {
                    colum += 1;
                }
            }

            char[][] matrix = new char[row][colum];
            int countX = 0;
            for (int i = 0; i < colum; i++) {
                for (int j = 0; j < row; j++) {
                    if (countX == x.length) {
                        break;
                    }
                    if (s.charAt(countX) == ' ' && j != row-1) {
                        matrix[j][i] = s.charAt(countX++);
                    }
                    matrix[j][i] = s.charAt(countX);
                    countX++;
                }
            }

            countX = 0;
            char[] decode = new char[N];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colum; j++) {
                    if (countX == decode.length) {
                        z = new String(decode);
                        return z;
                    }
                    decode[countX] = matrix[i][j];
                    countX++;
                }
            }
            z = new String(decode).trim();
            return z;
        }
        return s;
    }
}


