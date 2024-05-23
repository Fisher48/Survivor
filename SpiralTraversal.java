public class SpiralTraversal {

    public static int[] matrix(int n, int m, int [][] matrix){
        int[] spiral = new int[n * m];
        int row = 0;
        int colum = 0;
        int count = 0;
        while (colum < n || row < m) {
            if (colum >= n || row >= m) {
                break;
            }
            for (int i = colum; i < n; i++) {
                spiral[count++] = matrix[row][i];
            }
            row++;
            for (int j = row; j < m; j++) {
                spiral[count++] = matrix[j][n - 1];
            }
            n--;
            if (row < m) {
                for (int i = n - 1; i >= colum; i--) {
                    spiral[count++] = matrix[m - 1][i];
                }
            }
            m--;
            if (colum < n) {
                for (int j = m - 1; j >= row; j--) {
                    spiral[count++] = matrix[j][colum];
                }
            }
            colum++;
        }
        return spiral;
    }
}


