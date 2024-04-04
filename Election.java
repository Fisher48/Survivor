import java.util.*;

public class Election {

    public static String MassVote(int N, int [] Votes) {
        String winner = "winner ";
        int K = 0;
        boolean win = true;
        int sum = 0;
        int max = 0;
        double percent;

        for (int i = 0; i < N; i++) {
            sum += Votes[i];
            if (Votes[i] >= max) {
                max = Votes[i];
                K = i + 1;
            }
        }

        int countWinners = 0;
        for (Integer j: Votes) {
            if (j == max) {
                countWinners += 1;
            }
            if (countWinners > 1) {
                win = false;
            }
        }

        percent = (int) (max * 1.0 / sum * 100000.0) / 1000.0;

        if (!win) {
            return "no winner";
        }
        if (percent > 50.0) {
            return  "majority " + winner + K;
        }
        if (percent <= 50.0) {
            return  "minority " + winner + K;
        }
        return winner;
    }
}


