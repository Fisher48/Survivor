import java.util.*;

public class Level1 {

    public static String MassVote(int N, int [] Votes) {
        String winner = "winner ";
        int K = 0;
        boolean win = true;
        int sumOfVotes = 0;
        int max = 0;
        double percent;

        for (int i = 0; i < N; i++) {
            sumOfVotes += Votes[i];
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

        percent = (int) (max * 1.0 / sumOfVotes * 100000.0) / 1000.0;

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


