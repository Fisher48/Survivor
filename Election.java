import java.util.*;

public class Election {

    public static String MassVote(int N, int [] Votes) {
        String winner = "winner ";
        int possibleCandidate = 0;
        boolean isOneWinner = true;
        int sumOfVotesOnElection = 0;
        int max = 0;
        double percent;

        for (int i = 0; i < N; i++) {
            sumOfVotesOnElection += Votes[i];
            if (Votes[i] >= max) {
                max = Votes[i];
                possibleCandidate = i + 1;
            }
        }

        int countWinners = 0;
        for (Integer j: Votes) {
            if (j == max) {
                countWinners += 1;
            }
            if (countWinners > 1) {
                isOneWinner = false;
            }
        }

        percent = (int) (max * 1.0 / sumOfVotesOnElection * 100000.0) / 1000.0;

        if (!isOneWinner) {
            return "no winner";
        }
        if (percent > 50.0) {
            return  "majority " + winner + possibleCandidate;
        }
        if (percent <= 50.0) {
            return  "minority " + winner + possibleCandidate;
        }
        return winner;
    }
}


