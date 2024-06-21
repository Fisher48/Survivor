public class ArmyCommunication {

    public static String getSubMatrix(String s, int m, int prevSum, int n, int[][]matrix) {
        if (m == n) {
            return s;
        }
        for (int k = 0; k < n - m + 1; k++) {
            for (int l = 0; l < n - m + 1; l++) {
                int currSum = 0;
                for (int i = k; i < m + k; i++) {
                    for (int j = l; j < m + l; j++) {
                        currSum += matrix[i][j];
                    }
                }
                if (prevSum < currSum) {
                    prevSum = currSum;
                    s = l + " " + k + " " + m;
                }
            }
        }
        return getSubMatrix(s, m + 1, prevSum, n, matrix);
    }

    public static String army_communication_matrix(int n, int [][] matrix) {
        String s = "";
        if (n == 2) {
            return "0 0 2";
        }
        return getSubMatrix(s, 2, 0, n, matrix);
    }
}
