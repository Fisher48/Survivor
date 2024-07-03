import java.util.*;

public class TankRush {

    public static final String CHECKED = ".";

    // На входе два массива (карта и группировка танков), каждый описывается одинаково:
    // количество строк - H1 и H2, количество столбцов W1 и W2 и набор строк - S1 и S2, разделённых пробелом.
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

        boolean isExist = false;

        if (H1 >= H2 && W1 >= W2) {

            String[] areaMap = S1.split(" ");
            String[] checkZone = S2.split(" ");

            for (int i = 0; i <= areaMap.length - checkZone.length; i++) {
                int indexOfStr = areaMap[i].indexOf(String.valueOf(checkZone[0]));
                while (areaMap[i].contains(String.valueOf(checkZone[0]))) {
                    for (int j = 1; j < checkZone.length; j++) {
                        if (areaMap[i + j].substring(indexOfStr, indexOfStr + checkZone[0].length()).contentEquals(checkZone[j])) {
                            isExist = true;
                        } else {
                            isExist = false;
                            break;
                        }
                    }
                    if (!isExist) {
                        String check = areaMap[i].substring(indexOfStr, indexOfStr + checkZone[0].length());
                        if (check.equals(S2)) {
                            isExist = true;
                            return isExist;
                        }
                        areaMap[i] = CHECKED;
                        indexOfStr = areaMap[i].indexOf(String.valueOf(checkZone[0]));
                    } else {
                        break;
                    }
                }
                if (isExist) {
                    break;
                }
            }
        }
        return isExist;
    }
}


