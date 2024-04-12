import java.util.*;

public class Level1 {

    public static int MaximumDiscount(int N, int [] price) {
        int discount = 0;
        int countItems = 0;
        Arrays.sort(price);
        for (int i = N-1; i >= 0; i--) {
            countItems++;
            if (countItems == 3) {
                discount += price[i];
                countItems = 0;
            }
        }
        return discount;
    }
}


