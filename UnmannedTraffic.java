import java.util.*;

public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        boolean isRed = true;
        int totalTime = 0;
        int count = 0;  // общий счетчик ходов

        for (int k = 0; k < track.length; k++) {
            int timeLight = 0;
            int waitTime = 0;
            int timeDrive = 0;
            while (true) {
                timeDrive += 1;
                count += 1;
                timeLight += 1;
                if (timeLight > track[k][1] + track[k][2]) {
                    timeLight = 1;
                }
                if (timeLight <= track[k][1]) {
                    isRed = true;
                }
                if (timeLight > track[k][1] && timeLight <= track[k][1] + track[k][2]) {
                    isRed = false;
                }
                if (!isRed && k == 0 && track.length > 1) {
                    totalTime = track[k][0] + waitTime + (track[k + 1][0] - track[k][0]);
                    break;
                }
                if (count > track[k][0] && isRed && k == 0) {
                    waitTime += 1;
                }
                if (timeDrive > totalTime && isRed && k > 0) {
                    waitTime += 1;
                }
                if (timeDrive >= totalTime && !isRed && k < track.length - 1) {
                    totalTime += waitTime + (track[k + 1][0] - track[k][0]);
                    break;
                }
                if (timeDrive >= totalTime && !isRed && k == track.length - 1 && track.length > 1) {
                    totalTime += waitTime + (L - track[k][0]);
                    return totalTime;
                }
                if (!isRed && track.length == 1) {
                    totalTime = track[k][0] + waitTime + (L - track[k][0]);
                    return totalTime;
                }
            }
        }
        return totalTime;
    }
}


