import java.util.*;

public class Level1 {
    public static int squirrel(int N) {

        if (N < 0) {
            throw new IllegalArgumentException("Number is negative: " + N);
        }

        int e = 1;
        for (int i = N; i > 0; i--) {
            assert (e > 0) : "Out of range for int";
            e *= N--;
        }
        while (e > 10) {
            e = e / 10;
        }
        return e;
    }
}

