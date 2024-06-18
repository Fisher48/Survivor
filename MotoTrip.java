import java.util.*;

public class Level1 {
    public static int odometer(int[] oksana) {
        int totalDistance = 0;
        if (oksana.length < 2) {
            throw new IllegalArgumentException("Array size should be >= 2: " + "but current size: " + oksana.length);
        }
        for (int i = 0; i < oksana.length; i++) {
            if (oksana[i] < 0) {
                throw new IllegalArgumentException("Speed or time is negative: " + oksana[i]);
            }
            if (i % 2 == 0 && i > 0) {
                totalDistance += oksana[i] * (oksana[i + 1] - oksana[i - 1]);
            } else if (i == 0) {
                totalDistance = oksana[i] * oksana[i + 1];
            }
        }
        return totalDistance;
    }
}


