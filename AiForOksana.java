import java.util.*;

public class Level1 {
   public static int SumOfThe(int N, int [] data){
        int x = 0;
        int sumOfAllNumbersEqualsOtherNumber = 0;
        int temp = 0;
        for (int i = 0; i <= N; i++) {
            sumOfAllNumbersEqualsOtherNumber = data[i];
            temp = sumOfAllNumbersEqualsOtherNumber;
            data[i] = 0;
            for (int j = 0; j < N; j++){
                x += data[j];

            }
            if (x == sumOfAllNumbersEqualsOtherNumber) {
                 return sumOfAllNumbersEqualsOtherNumber;
            }
            data[i] = temp;
            x = 0;
        }
        return sumOfAllNumbersEqualsOtherNumber;
    }
}


