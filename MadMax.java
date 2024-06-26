import java.util.*;

public class MadMax {

    public static int [] getImpulse(int N, int [] Tele) {
        int maxValue = 0;
        Arrays.sort(Tele);
        for (int element : Tele) {
            if (element >= maxValue) {
                maxValue = element;
            }
        }
        int[] impulse = new int[N];
        for (int i = 0; i <= N/2; i++) {
            impulse[i] = Tele[i];
            if (i == N / 2) {
                impulse[i] = maxValue;
            }
        }
        for (int i = 1; i <= N/2; i++) {
                impulse[(N/2)+i] = Tele[N-i-1];
        }
        return impulse;
    }
}


