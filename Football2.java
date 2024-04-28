import java.util.*;

public class Football2 {

    public static boolean Football(int F[], int N) {
        boolean method = false;
        int curr;
        for (int i = F.length-1; i > 0; i--) {
            if (F[i - 1] < F[i]) {
                method = false;
                break;
            }
            method = true;
        }
        if (!method) {
            for (int i = 0; i < F.length - 1; i++) {
                for (int j = i + 1; j < F.length; j++) {
                    if (F[j] < F[i]) {
                        curr = F[j];
                        F[j] = F[i];
                        F[i] = curr;
                        for (int k = 0; k < F.length-1; k++) {
                            if (F[k] > F[k + 1]) {
                                curr = F[j];
                                F[j] = F[i];
                                F[i] = curr;
                                method = false;
                                break;
                            }
                            method = true;
                        }
                    }
                    if (method) {
                        break;
                    }
                }
                if (method) {
                    break;
                }
            }
        }
        return method;
    }
}


