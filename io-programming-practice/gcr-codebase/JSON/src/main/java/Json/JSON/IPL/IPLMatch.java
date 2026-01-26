package Json.JSON.IPL;

public class IPLMatch {
	int matchId;
    String team1;
    String team2;
    int scoreTeam1;
    int scoreTeam2;
    String winner;
    String playerOfMatch;

    public IPLMatch(int matchId, String team1, String team2,int scoreTeam1, int scoreTeam2, String winner, String playerOfMatch) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
        this.winner = winner;
        this.playerOfMatch = playerOfMatch;
    }

}
