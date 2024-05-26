public class ArmyCommunication {

    public static String findSubMatrix(String s, int colum, int row, int prevSum, int currSum, int n, int[][]matrix) {
        StringBuffer sb = new StringBuffer();
        if (colum == 0 && row == 1) {
            return s;
        }
        else if (colum == 1 && row == 1) {
            colum--;
        }
        else if (colum == 1) {
            row++;
        }
        else if (colum == 0 && (!s.isEmpty())) {
            colum++;
        }
        for (int i = row; i < n + row; i++){
            for (int j = colum; j < n + colum; j++){
                currSum += matrix[i][j];
            }
        }
        if (prevSum < currSum || s.isEmpty()) {
            sb.append(colum + " " + row + " " + n);
            prevSum = currSum;
            s = sb.toString();
        }
        return findSubMatrix(s,colum,row,prevSum,0,n,matrix);
    }

    public static String army_communication_matrix(int n, int [][] matrix) {
        String s = "";
        int row = 0;
        int colum = 0;
        int currSum = 0;
        int prevSum = 0;
        return findSubMatrix(s,row,colum,prevSum,currSum,n-1,matrix);
    }
}
