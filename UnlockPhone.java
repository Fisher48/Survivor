import java.util.*;

public class Level1 {
    public static String PatternUnlock(int N, int [] hits) {
        int [][] phone = new int[3][3];
        phone[0][0] = 6; phone[0][1] = 1; phone[0][2] = 9;
        phone[1][0] = 5; phone[1][1] = 2; phone[1][2] = 8;
        phone[2][0] = 4; phone[2][1] = 3; phone[2][2] = 7;
        double temp;
        double sum = 0;

        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < phone.length; j++) {
                for (int k = 0; k < phone[j].length; k++) {
                    if (hits[i] == phone[j][k] && k - 1 <= 2 && k - 1 >= 0 && phone[j][k - 1] == hits[i + 1]){
                        temp = 1;
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && j + 1 <= 2 && j + 1 >= 0 && phone[j + 1][k] == hits[i + 1]){
                        temp = 1;
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && k + 1 <= 2 && k + 1 >= 0 && phone[j][k + 1] == hits[i + 1]){
                        temp = 1;
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && j - 1 <= 2 && j - 1 >= 0 && phone[j - 1][k] == hits[i + 1]){
                        temp = 1;
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && (j - 1 <= 2 && j - 1 >= 0 && k - 1 <= 2 && k - 1 >= 0)
                            && phone[j - 1][k - 1] == hits[i + 1]){
                        temp = Math.sqrt(2);
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && (j - 1 <= 2 && j - 1 >= 0 && k + 1 <= 2 && k + 1 >= 0)
                            && phone[j - 1][k + 1] == hits[i + 1]){
                        temp = Math.sqrt(2);
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && (j + 1 <= 2 && j + 1 >= 0 && k + 1 <= 2 && k + 1 >= 0)
                            && phone[j + 1][k + 1] == hits[i + 1]){
                        temp = Math.sqrt(2);
                        sum += temp;
                    }
                    if (hits[i] == phone[j][k] && (j + 1 <= 2 && j + 1 >= 0 && k - 1 <= 2 && k - 1 >= 0)
                            && phone[j + 1][k - 1] == hits[i + 1]){
                        temp = Math.sqrt(2);
                        sum += temp;
                    }
                }
            }
        }
        String result = String.format("%.5f",sum);
        result = result.replaceAll(",","");
        result = result.replaceAll("0","");
        if (sum == 0) {
            result = "";
            return result;
        } else {
            return result;
        }
    }
}


