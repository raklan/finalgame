public class Score {

    private String playerName;
    private int hiScore;

    public Score(String n, int hS){
        playerName = n;
        hiScore = hS;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHiScore() {
        return hiScore;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return ":"+playerName+"-"+hiScore;
    }

    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }
}
