import java.util.*;

public class AiForOksana {

   public static int SumOfThe(int N, int [] data){
        int checkNumber = 0;
        for (int i = 0; i <= N; i++) {
            checkNumber = data[i];
            int temp = checkNumber;
            data[i] = 0;
            int sumOfAllOtherNumbers = 0;
            for (int j = 0; j < N; j++) {
                sumOfAllOtherNumbers += data[j];
            }
            if (sumOfAllOtherNumbers == checkNumber) {
                return checkNumber;
            }
            data[i] = temp;
        }
        return checkNumber;
    }
}


