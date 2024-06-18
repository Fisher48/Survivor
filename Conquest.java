import java.util.*;
public class Conquest {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int days = 1;
        boolean isCaptured = false;
        int[][] square = new int[N][M];
        int expectedSum = N * M;
        int sum = 0;

        if (battalion.length == L * 2) {
            for (int i = 0; i <= L * 2 - 1; i += 2) {
                square[battalion[i] - 1][battalion[i + 1] - 1] = 1;
            }
        }
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= M - 1; j++) {
                sum += square[i][j];
            }
        }
        if (sum == expectedSum) {
            isCaptured = true;
        }
        while (!isCaptured) {
            for (int i = 0; i <= N - 1; i++) {
                for (int j = 0; j <= M - 1; j++) {
                    if (square[i][j] == days) {
                        if (i == 0) {
                            if (j == 0) {
                                if (square[i + 1][j] == 0) {
                                    square[i + 1][j] = days + 1;
                                }
                                if (square[i][j + 1] == 0) {
                                    square[i][j + 1] = days + 1;
                                }
                            }
                            if (j == M - 1) {
                                if (square[i][j - 1] == 0) {
                                    square[i][j - 1] = days + 1;
                                }
                                if (square[i + 1][j] == 0) {
                                    square[i + 1][j] = days + 1;
                                }
                            }
                            if (j > 0 && j < M - 1) {
                                if (square[i][j - 1] == 0) {
                                    square[i][j - 1] = days + 1;
                                }
                                if (square[i + 1][j] == 0) {
                                    square[i + 1][j] = days + 1;
                                }
                                if (square[i][j + 1] == 0) {
                                    square[i][j + 1] = days + 1;
                                }
                            }
                        }
                        if (i == N - 1) {
                            if (j == 0) {
                                if (square[i - 1][j] == 0) {
                                    square[i - 1][j] = days + 1;
                                }
                                if (square[i][j + 1] == 0) {
                                    square[i][j + 1] = days + 1;
                                }
                            }
                            if (j == M - 1) {
                                if (square[i][j - 1] == 0) {
                                    square[i][j - 1] = days + 1;
                                }
                                if (square[i - 1][j] == 0) {
                                    square[i - 1][j] = days + 1;
                                }
                            }
                            if (j > 0 && j < M - 1) {
                                if (square[i][j - 1] == 0) {
                                    square[i][j - 1] = days + 1;
                                }
                                if (square[i - 1][j] == 0) {
                                    square[i - 1][j] = days + 1;
                                }
                                if (square[i][j + 1] == 0) {
                                    square[i][j + 1] = days + 1;
                                }
                            }
                        }
                        if (i < N - 1 && i > 0 && j == 0) {
                            if (square[i - 1][j] == 0) {
                                square[i - 1][j] = days + 1;
                            }
                            if (square[i + 1][j] == 0) {
                                square[i + 1][j] = days + 1;
                            }
                            if (square[i][j + 1] == 0) {
                                square[i][j + 1] = days + 1;
                            }
                        }
                        if (i < N - 1 && i > 0 && j == M - 1) {
                            if (square[i - 1][j] == 0) {
                                square[i - 1][j] = days + 1;
                            }
                            if (square[i + 1][j] == 0) {
                                square[i + 1][j] = days + 1;
                            }
                            if (square[i][j - 1] == 0) {
                                square[i][j - 1] = days + 1;
                            }
                        }
                        if (i > 0 && i < N - 1 && j > 0 && j < M - 1) {
                            if (square[i - 1][j] == 0) {
                                square[i - 1][j] = days + 1;
                            }
                            if (square[i + 1][j] == 0) {
                                square[i + 1][j] = days + 1;
                            }
                            if (square[i][j - 1] == 0) {
                                square[i][j - 1] = days + 1;
                            }
                            if (square[i][j + 1] == 0) {
                                square[i][j + 1] = days + 1;
                            }
                        }
                    }
                }
            }
            for (int k = 0; k <= N - 1; k++) {
                for (int l = 0; l <= M - 1; l++) {
                    if (square[k][l] != 0) {
                        square[k][l] = days + 1;
                    }
                }
            }
            days++;

            isCaptured = true;
            for (int i = 0; i <= N - 1; i++) {
                for (int j = 0; j <= M - 1; j++) {
                    if (square[i][j] == 0) {
                        isCaptured = false;
                        break;
                    }
                }
            }
        }
        return days;
    }
}


