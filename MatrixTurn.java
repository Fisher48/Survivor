import java.util.*;

public class Level1 {

    public static void MatrixTurn(String Matrix[], int M, int N, int T) {
        int[][] digitsMatrix = new int[M][N];
        char[] arr;
        for (int i = 0; i < M; i++) {
            arr = Matrix[i].toCharArray();
            for (int j = 0; j < N; j++) {
                digitsMatrix[i][j] = Integer.parseInt(String.valueOf(arr[j]));
            }
        }
        int row = 0;
        int colum = 0;
        int prev;
        int curr;

        for (int step = 0; step < T; step++) {
            row = 0;
            colum = 0;
            M = digitsMatrix.length;
            N = digitsMatrix[0].length;

            while (row < N && colum < M) {

                if (row + 1 == M || colum + 1 == N) {
                    break;
                }

                prev = digitsMatrix[row + 1][colum];

                for (int i = colum; i < N; i++) {
                    curr = digitsMatrix[row][i];
                    digitsMatrix[row][i] = prev;
                    prev = curr;
                }
                row++;

                for (int j = row; j < M; j++) {
                    curr = digitsMatrix[j][N - 1];
                    digitsMatrix[j][N - 1] = prev;
                    prev = curr;
                }
                N--;

                if (row < M) {
                    for (int i = N - 1; i >= colum; i--) {
                        curr = digitsMatrix[M - 1][i];
                        digitsMatrix[M - 1][i] = prev;
                        prev = curr;
                    }
                }
                M--;

                if (colum < M) {
                    for (int j = M - 1; j >= row; j--) {
                        curr = digitsMatrix[j][colum];
                        digitsMatrix[j][colum] = prev;
                        prev = curr;
                    }
                }
                colum++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digitsMatrix.length; i++) {
            for (int j = 0; j < digitsMatrix[0].length; j++){
                sb.append(digitsMatrix[i][j]);
            }
            Matrix[i] = sb.toString();
            sb = new StringBuilder();
        }
    }
}


