import java.util.*;

public class Level1 {
    public static String PatternUnlock(int N, int [] hits) {
        int [][] phone = new int[3][3];
        phone[0][0] = 6; phone[0][1] = 1; phone[0][2] = 9;
        phone[1][0] = 5; phone[1][1] = 2; phone[1][2] = 8;
        phone[2][0] = 4; phone[2][1] = 3; phone[2][2] = 7;
        double temp;
        double sum = 0;

        for (int i = 0; i < N; i++) {
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
        sum *= 100000;
        int intSum = (int) sum;
        int finishSum = 0;
        int numd = 1;
        for (int i = 0; 0 < intSum; i++) {
            if (intSum % 10 != 0) {
                finishSum += intSum % 10 * numd;
                numd *= 10;
            }
            intSum /= 10;
        }
        if (finishSum == 0){
            String result = "";
            return result;
        } else {
            String result = String.valueOf(finishSum);
            return result;
        }
    }
}


