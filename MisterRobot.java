import java.util.*;

public class MisterRobot {

    public static int[] getSortedSequence(int[] temp){
        for (int i = 0; i < 2; i++) {
            int x = temp[i];
            temp[i] = temp[i + 1];
            temp[i + 1] = x;
        }
        if (temp[0] <= temp[1] && temp[1] <= temp[2]) {
            return temp;
        } else {
            getSortedSequence(temp);
        }
        return temp;
    }

    public static boolean MisterRobot(int N, int[] data){
        int[] temp = new int[3];
        for (int i = 0; i < N; i++) {
            if (i < N - 2) {
                if (data[i] < data[i + 1] && data[i + 1] > data[i + 2] && data[i + 2] < data[i]) {
                    temp[0] = data[i];
                    temp[1] = data[i + 1];
                    temp[2] = data[i + 2];
                    getSortedSequence(temp);
                    data[i] = temp[0];
                    data[i + 1] = temp[1];
                    data[i + 2] = temp[2];
                    i -= i + 1;
                } else if (data[i] > data[i + 1] && data[i] < data[i + 2] && data[i + 1] < data[i + 2]) {
                    return false;
                }
            }
        }
        int[] sortedArray = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedArray);
        return Arrays.equals(sortedArray,data);
    }
}


