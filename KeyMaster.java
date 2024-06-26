import java.util.*;

public class KeyMaster {

    public static final String OPEN_DOOR = "1";
    public static final String CLOSED_DOOR = "0";

    public static String Keymaker(int k) {
        String[] matrixK = new String[k];
        Arrays.fill(matrixK, CLOSED_DOOR);
        for (int j = 1; j <= k; j++) {
            for (int i = j - 1; i < k; i += j) {
                if (matrixK[i].equals(CLOSED_DOOR)) {
                    matrixK[i] = OPEN_DOOR;
                } else {
                    matrixK[i] = CLOSED_DOOR;
                }
            }
        }
        StringBuffer doors = new StringBuffer();
        for (int x = 0; x < k; x++) {
            doors.append(matrixK[x]);
        }
        return String.valueOf(doors);
    }
}


