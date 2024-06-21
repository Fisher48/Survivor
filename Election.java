import java.util.*;

public class Election {

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

        percent = (int) (maxVotes * 1.0 / sumOfVotesOnElection * 100000.0) / 1000.0;

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


