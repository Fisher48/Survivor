import java.util.*;

public class Cyberpunk {

    public static boolean isEquivalentArrays(int [] arr1, int [] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        Map<Integer, Integer> repeatList = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            repeatList.put(arr1[i], repeatList.getOrDefault(arr1[i],0) + 1);
        }
        for (Integer j : arr2) {
            if (!repeatList.containsKey(j) || repeatList.get(j) == 0) {
                return false;
            } else {
                repeatList.put(j, repeatList.getOrDefault(j,0) - 1);
            }
        }
        return true;
    }
}


