import java.util.*;

public class Level1 {
   public static int SumOfThe(int N, int [] data){
        int x = 0;
        int sumOfAllOtherNumbers = 0;
        int temp = 0;
        for (int i = 0; i <= N; i++) {
            sumOfAllOtherNumbers = data[i];
            temp = sumOfAllOtherNumbers;
            data[i] = 0;
            for (int j = 0; j < N; j++){
                x += data[j];

            }
            if (x == sumOfAllOtherNumbers) {
                 return sumOfAllOtherNumbers;
            }
            data[i] = temp;
            x = 0;
        }
        return sumOfAllOtherNumbers;
    }
}


