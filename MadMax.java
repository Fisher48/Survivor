import java.util.*;
public class Level1 {
    public static int [] MadMax(int N, int [] Tele) {
        int[] impulse = new int[N];
        int max = 0;
        Arrays.sort(Tele);
        for (int x : Tele) {
            if (x >= max) {
                max = x;
            }
        }
        for (int i = 0; i <= N/2; i++) {
            impulse[i] = Tele[i];
            if (i == N / 2) {
                impulse[i] = max;
            }
        }
        for (int i = 1; i <= N/2; i++) {
                impulse[(N/2)+i] = Tele[N-i-1];
            }
        return impulse;
    }
}


