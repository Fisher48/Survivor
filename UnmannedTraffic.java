import java.util.*;

public class UnmannedTraffic {

    // Функция получает - L дороги, N - кол-во светофоров, дорога int[][] track,
    // 0 - расположение светофора
    // 1 - время показа красного света.
    // 2 - время показа зелёного цвета.
    // И возвращает реальное время, требуемое для преодоления дороги.
    public static int Unmanned(int L, int N, int[][] track) {
        int totalTime = 0;
        int count = 0;
        for (int k = 0; k < track.length; k++) {
            boolean isRed = true;
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


