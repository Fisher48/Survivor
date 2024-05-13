import java.util.*;

public class DigitalRain2 {

    public static String digital_rain(String col) {
        int balance = 0;
        int firstIndex = 0;
        int maxLen = 0;
        Map<Integer, Integer> balIndex = new HashMap<>();
        for (int i = 0; i < col.length(); i++) {
            if (col.charAt(i) == '1') {
                balance++;
            } else {
                balance--;
            }
            if (balIndex.containsKey(balance)) {
                int prevIndex = balIndex.get(balance);
                if (i - prevIndex > maxLen - 1) {
                    maxLen = i - prevIndex;
                    firstIndex = prevIndex + 1;
                }
            } else {
                balIndex.put(balance, i);
            }
        }
        if (balance == 0) {
            return col;
        }
        return col.substring(firstIndex, firstIndex + maxLen);
    }
}


