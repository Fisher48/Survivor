import java.util.*;

public class Level1 {

    public static String Keymaker(int k) {
        StringBuffer doors = new StringBuffer();
        String[] matrixK = new String[k];
        Arrays.fill(matrixK, "0");

        int steps = 0;
        int count = 0;
        for (int j = 0; j < k; j++) {
            if (steps == 3) {
                steps = 0;
            }
            steps++;
            count = 0;
            for (int i = 0; i < k; i++) {
                count++;
                if (steps == 1) {
                    matrixK[i] = "1";
                }
                if (steps == 2 && count % 2 == 0) {
                    matrixK[i] = "0";
                }
                if (steps == 3 && count % 3 == 0 && matrixK[i].equals("0")) {
                    matrixK[i] = "1";
                } else if (steps == 3 && count % 3 == 0 && matrixK[i].equals("1")) {
                    matrixK[i] = "0";
                }
            }
        }
        for (int x = 0; x < k; x++){
            doors.append(matrixK[x]);
        }
        return String.valueOf(doors);
    }
}


