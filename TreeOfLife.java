import java.util.*;

public class Level1 {

    public static int[][] destructionOfTree(int[][] tree) {

        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[0].length; j++) {
                if (tree[i][j] >= 3) {
                    tree[i][j] = 0;
                    if (i == 0) {
                        if (j == 0) {
                            if (tree[i + 1][j] < 3) {
                                tree[i + 1][j] = 0;
                            }
                            if (tree[i][j + 1] < 3) {
                                tree[i][j + 1] = 0;
                            }
                        }
                        if (j == tree[0].length - 1) {
                            if (tree[i][j - 1] < 3) {
                                tree[i][j - 1] = 0;
                            }
                            if (tree[i + 1][j] < 3) {
                                tree[i + 1][j] = 0;
                            }
                        }
                        if (j > 0 && j < tree[0].length - 1) {
                            if (tree[i][j - 1] < 3) {
                                tree[i][j - 1] = 0;
                            }
                            if (tree[i + 1][j] < 3) {
                                tree[i + 1][j] = 0;
                            }
                            if (tree[i][j + 1] < 3) {
                                tree[i][j + 1] = 0;
                            }
                        }
                    }
                    if (i == tree.length - 1) {
                        if (j == 0) {
                            if (tree[i - 1][j] < 3) {
                                tree[i - 1][j] = 0;
                            }
                            if (tree[i][j + 1] < 3) {
                                tree[i][j + 1] = 0;
                            }
                        }
                        if (j == tree[0].length - 1) {
                            if (tree[i][j - 1] < 3) {
                                tree[i][j - 1] = 0;
                            }
                            if (tree[i - 1][j] < 3) {
                                tree[i - 1][j] = 0;
                            }
                        }
                        if (j > 0 && j < tree[0].length - 1) {
                            if (tree[i][j - 1] < 3) {
                                tree[i][j - 1] = 0;
                            }
                            if (tree[i - 1][j] < 3) {
                                tree[i - 1][j] = 0;
                            }
                            if (tree[i][j + 1] < 3) {
                                tree[i][j + 1] = 0;
                            }
                        }
                    }
                    if (i < tree.length - 1 && i > 0 && j == 0) {
                        if (tree[i - 1][j] < 3) {
                            tree[i - 1][j] = 0;
                        }
                        if (tree[i + 1][j] < 3) {
                            tree[i + 1][j] = 0;
                        }
                        if (tree[i][j + 1] < 3) {
                            tree[i][j + 1] = 0;
                        }
                    }
                    if (i < tree.length - 1 && i > 0 && j == tree[0].length - 1) {
                        if (tree[i - 1][j] < 3) {
                            tree[i - 1][j] = 0;
                        }
                        if (tree[i + 1][j] < 3) {
                            tree[i + 1][j] = 0;
                        }
                        if (tree[i][j - 1] < 3) {
                            tree[i][j - 1] = 0;
                        }
                    }
                    if (i > 0 && i < tree.length - 1 && j > 0 && j < tree[0].length - 1) {
                        if (tree[i - 1][j] < 3) {
                            tree[i - 1][j] = 0;
                        }
                        if (tree[i + 1][j] < 3) {
                            tree[i + 1][j] = 0;
                        }
                        if (tree[i][j - 1] < 3) {
                            tree[i][j - 1] = 0;
                        }
                        if (tree[i][j + 1] < 3) {
                            tree[i][j + 1] = 0;
                        }
                    }
                }
            }
        }
        return tree;
    }

    public static String[] TreeOfLife(int H, int W, int N, String [] tree){
        int[][] treeDigitArray = new int[H][W];
        int years = 0;
        char[] temp;
        for (int i = 0; i < H; i++) {
            temp = tree[i].toCharArray();
            for (int j = 0; j < W; j++) {
                if (temp[j] == '.') {
                    treeDigitArray[i][j] = 0;
                } else {
                    treeDigitArray[i][j] = 1;
                }
            }
        }

        while (years < N) {
            years++;
            for (int k = 0; k < treeDigitArray.length; k++) {
                for (int z = 0; z < treeDigitArray[0].length; z++) {
                    treeDigitArray[k][z] += 1;
                }
            }

            for (int k = 0; k < treeDigitArray.length; k++) {
                for (int z = 0; z < treeDigitArray[0].length; z++) {
                    if (treeDigitArray[k][z] >= 3 && years % 2 != 1) {
                        destructionOfTree(treeDigitArray);
                        break;
                    }
                }
            }
        }
        String[] treeAfterLifecycle = new String[tree.length];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < treeDigitArray.length; i++) {
            for (int j = 0; j < treeDigitArray[0].length; j++){
                if (treeDigitArray[i][j] == 0) {
                    sb.append('.');
                }
                else {
                    sb.append('+');
                }
            }
            treeAfterLifecycle[i] = String.valueOf(sb);
            sb = new StringBuffer();
        }
        return treeAfterLifecycle;
    }
}


