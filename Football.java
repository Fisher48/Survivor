import java.util.*;

public class Football {

    public static int[] backCurrF(int[] changeF){
        return Arrays.copyOf(changeF, changeF.length);
    }

    public static boolean first(int[] F, int N) {
        int[] temp = Arrays.copyOf(F,N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {
            int one = F[i];
            for (int j = i + 1; j < N; j++) {
                int two = F[j];
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
        int[] temp = Arrays.copyOf(F,N);
        int[] currF = Arrays.copyOf(F,N);
        Arrays.sort(temp);
        int change = 0;
        // Изменяем на обратный порядок, двигаясь влево
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

        // Изменяем на обратный порядок, двигаясь к центру
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
        // Изменяем на обратный порядок, двигаясь вправо
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

    public static boolean Football(int[] F, int N){
        int[] temp = Arrays.copyOf(F,N);
        Arrays.sort(temp);
        if (Arrays.equals(temp, F)){
            return false;
        }
        return first(F, N) || second(F, N);
    }
}


