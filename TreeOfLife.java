import java.util.*;

public class Level1 {

    public static int[][] func(int[][] a, int years) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] >= 3) {
                    a[i][j] = 0;
                    if (i == 0) {
                        if (j == 0) {
                            if (a[i + 1][j] < 3) {
                                a[i + 1][j] = 0;
                            }
                            if (a[i][j + 1] < 3) {
                                a[i][j + 1] = 0;
                            }
                        }
                        if (j == a[0].length - 1) {
                            if (a[i][j - 1] < 3) {
                                a[i][j - 1] = 0;
                            }
                            if (a[i + 1][j] < 3) {
                                a[i + 1][j] = 0;
                            }
                        }
                        if (j > 0 && j < a[0].length - 1) {
                            if (a[i][j - 1] < 3) {
                                a[i][j - 1] = 0;
                            }
                            if (a[i + 1][j] < 3) {
                                a[i + 1][j] = 0;
                            }
                            if (a[i][j + 1] < 3) {
                                a[i][j + 1] = 0;
                            }
                        }
                    }
                    if (i == a.length - 1) {
                        if (j == 0) {
                            if (a[i - 1][j] < 3) {
                                a[i - 1][j] = 0;
                            }
                            if (a[i][j + 1] < 3) {
                                a[i][j + 1] = 0;
                            }
                        }
                        if (j == a[0].length - 1) {
                            if (a[i][j - 1] < 3) {
                                a[i][j - 1] = 0;
                            }
                            if (a[i - 1][j] < 3) {
                                a[i - 1][j] = 0;
                            }
                        }
                        if (j > 0 && j < a[0].length - 1) {
                            if (a[i][j - 1] < 3) {
                                a[i][j - 1] = 0;
                            }
                            if (a[i - 1][j] < 3) {
                                a[i - 1][j] = 0;
                            }
                            if (a[i][j + 1] < 3) {
                                a[i][j + 1] = 0;
                            }
                        }
                    }
                    if (i < a.length - 1 && i > 0 && j == 0) {
                        if (a[i - 1][j] < 3) {
                            a[i - 1][j] = 0;
                        }
                        if (a[i + 1][j] < 3) {
                            a[i + 1][j] = 0;
                        }
                        if (a[i][j + 1] < 3) {
                            a[i][j + 1] = 0;
                        }
                    }
                    if (i < a.length - 1 && i > 0 && j == a[0].length - 1) {
                        if (a[i - 1][j] < 3) {
                            a[i - 1][j] = 0;
                        }
                        if (a[i + 1][j] < 3) {
                            a[i + 1][j] = 0;
                        }
                        if (a[i][j - 1] < 3) {
                            a[i][j - 1] = 0;
                        }
                    }
                    if (i > 0 && i < a.length - 1 && j > 0 && j < a[0].length - 1) {
                        if (a[i - 1][j] < 3) {
                            a[i - 1][j] = 0;
                        }
                        if (a[i + 1][j] < 3) {
                            a[i + 1][j] = 0;
                        }
                        if (a[i][j - 1] < 3) {
                            a[i][j - 1] = 0;
                        }
                        if (a[i][j + 1] < 3) {
                            a[i][j + 1] = 0;
                        }
                    }
                }
            }
        }
        return a;
    }

    public static String [] TreeOfLife(int H, int W, int N, String [] tree){
        int[][] a = new int[H][W];
        int years = 0;
        char[] temp;
        for (int i = 0; i < H; i++) {
            temp = tree[i].toCharArray();
            for (int j = 0; j < W; j++) {
                if (temp[j] == '.') {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }

        while (years < N) {
            years++;
            for (int k = 0; k < a.length; k++) {
                for (int z = 0; z < a[0].length; z++) {
                    a[k][z] += 1;
                }
            }

            for (int k = 0; k < a.length; k++) {
                for (int z = 0; z < a[0].length; z++) {
                    if (a[k][z] >= 3 && years % 2 != 1) {
                        func(a, years);
                        break;
                    }
                }
            }
        }
        String[] result = new String[tree.length];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++){
                if (a[i][j] == 0) {
                    sb.append('.');
                }
                else {
                    sb.append('+');
                }
            }
            result[i] = String.valueOf(sb);
            sb = new StringBuffer();
        }
        return result;
    }
}


