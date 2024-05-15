import java.util.*;

public class Cyberpunk {

    public static boolean ECC_help(int [] arr1, int [] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Map<Integer, Integer> repeatList = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            repeatList.put(arr1[i], repeatList.getOrDefault(arr1[i],0) + 1);
            repeatList.put(arr2[i], repeatList.getOrDefault(arr2[i],0) - 1);
        }
        for (Integer j : repeatList.values()) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}


