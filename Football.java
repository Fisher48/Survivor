import java.util.*;

public class Football {

    public static int[] backCurrF(int[] changeF){
        int[] F = new int[changeF.length];
        for (int i = 0; i < changeF.length; i++) {
            F[i] = changeF[i];
        }
        return F;
    }

    public static boolean first(int F[], int N) {
        int one = 0;
        int two = 0;
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = F[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            one = F[i];
            for (int j = i + 1; j < N; j++) {
                two = F[j];
                F[i] = two;
                F[j] = one;
                if (!Arrays.equals(F, temp)) {
                    F[i] = one;
                    F[j] = two;
                } else {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean second(int F[], int N){
        int[] temp = new int[N];
        int[] currF = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = F[i];
            currF[i] = F[i];
        }
        Arrays.sort(temp);
        int change = 0;

        for (int i = 0; i < N / 2; i++) {
            for(int j = 0; j <= N / 2; j++) {
                change = F[j];
                F[j] = F[N - j - i - 1];
                F[N - j - i - 1] = change;
            }
            if (Arrays.equals(F, temp)){
                return true;
            } else {
               F = backCurrF(currF);
            }
        }

        while (N > 0) {
            for (int i = 0; i <= N / 2; i++) {
                for (int j = N - 1; j > N / 2; j--) {
                    change = F[j];
                    F[j] = F[N - j + i];
                    F[N - j + i] = change;
                }
                if (Arrays.equals(F, temp)) {
                    return true;
                } else {
                    F = backCurrF(currF);
                }
            }
            N--;
        }

        N = F.length-1;
        while (N > 0) {
                for (int j = 0; j < N / 2; j++) {
                    for (int i = 1; i < N / 2; i++) {
                        change = F[i + j];
                        F[i + j] = F[N - i + 1];
                        F[N - i + 1] = change;
                    }
                if (Arrays.equals(F, temp)) {
                    return true;
                } else {
                    F = backCurrF(currF);
                }
            }
            N--;
        }
        return false;
    }

    public static boolean Football(int F[], int N){
        int[] temp = new int[N];
        boolean win = false;
        for (int i = 0; i < N; i++) {
            temp[i] = F[i];
        }
        Arrays.sort(temp);
        if (Arrays.equals(temp, F)){
            return false;
        }
        win = first(F, N);
        if (!win) {
            win = second(F,N);
        }
        return win;
    }
}

