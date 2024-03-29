import java.util.*;

public class AiForOksana {
   public static int SumOfThe(int N, int [] data){
        int x = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = data[i];
            for (int j = i; j < data.length; j++) {
                if (sum != data[j]) {
                    sum += data[j];
                    x++;
                }
            }
            x = 0;
            sum = 0;
        }
        return sum;
    }
    public static void main(String[]args) {
        int N = 4;
        int [] data = {10, -25, -45, -35, 5};
        SumOfThe(N,data);
    }
}
