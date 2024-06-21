import java.util.*;

public class MaximumDiscount {

    public static int getMaxDiscount(int N, int [] price) {
        int maxDiscount = 0;
        int countItems = 0;
        Arrays.sort(price);
        for (int i = N-1; i >= 0; i--) {
            countItems++;
            if (countItems == 3) {
                maxDiscount += price[i];
                countItems = 0;
            }
        }
        return maxDiscount;
    }
}


