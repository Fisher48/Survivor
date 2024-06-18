import java.util.*;

public class Level1 {
   public static int [] UFO(int N, int [] data, boolean numberSystem) {

       int[] decimalCode = new int[N];
       int temp = 0;
       int numb = 0;
       int extent = 0;
       int ratio = 0;
       int currentNumb = 0;

       if (!numberSystem) {
           ratio = 16;
       } else if (numberSystem) {
           ratio = 8;
       }
       int count = 0;

       for (int j = 0; j < N; j++) {
           currentNumb = data[j];
           temp = currentNumb;
           while (currentNumb > 0) {
               count++;
               currentNumb /= 10;
           }
           int[] digits = new int[count];
           currentNumb = data[j];
           for (int k = 0; k < count; k++) {
               temp %= 10;
               currentNumb /= 10;
               digits[k] = temp;
               temp = currentNumb;
           }
           for (int i = 0; i < count; i++) {
               extent = (int) Math.pow(ratio, i);
               numb += extent * digits[i];
           }
           decimalCode[j] = numb;
           count = 0;
           numb = 0;
       }
       return decimalCode;
   }
}


