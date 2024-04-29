import java.util.*;

public class Level1 {

    public static String Keymaker(int k) {
        StringBuffer doors = new StringBuffer();
        String[] matrixK = new String[k];
        Arrays.fill(matrixK, "0");
        for (int j = 1; j <= k; j++) {
            for (int i = j - 1; i < k; i += j) {
                if (matrixK[i].equals("0")) {
                    matrixK[i] = "1";
                } else {
                    matrixK[i] = "0";
                }
            }
        }
        for (int x = 0; x < k; x++) {
            doors.append(matrixK[x]);
        }
        return String.valueOf(doors);
    }
}


