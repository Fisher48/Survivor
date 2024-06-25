import java.util.*;

public class Election {

    public static final double DECIMAL_PLACES = 1000.0;

    public static String getWinnerOfElection(int N, int [] Votes) {
        String winner = "winner ";
        int possibleCandidate = 0;
        boolean isOneWinner = true;
        int sumOfVotesOnElection = 0;
        int maxVotes = 0;
        double percent;

        for (int i = 0; i < N; i++) {
            sumOfVotesOnElection += Votes[i];
            if (Votes[i] >= maxVotes) {
                maxVotes = Votes[i];
                possibleCandidate = i + 1;
            }
        }

        int countWinners = 0;
        for (Integer j: Votes) {
            if (j == maxVotes) {
                countWinners += 1;
            }
            if (countWinners > 1) {
                isOneWinner = false;
            }
        }
        if (sumOfVotesOnElection == 0) {
            return "no winner";
        }

        percent = (double) (maxVotes * 100) / sumOfVotesOnElection;
        percent = Math.ceil(percent * DECIMAL_PLACES) / DECIMAL_PLACES;

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


