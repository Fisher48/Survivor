import java.util.*;

public class Level1 {
    public static int squirrel(int N) {

        if (N < 0) {
            throw new IllegalArgumentException("Number is negative: " + N);
        }

        int firstDigitFactorial = 1;
        for (int i = N; i > 0; i--) {
            assert (firstDigitFactorial > 0) : "Out of range for int";
            firstDigitFactorial *= N--;
        }
        while (firstDigitFactorial > 10) {
            firstDigitFactorial = firstDigitFactorial / 10;
        }
        return firstDigitFactorial;
    }
}

