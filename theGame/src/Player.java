import java.io.*;

public class Player {
    public int hiScore;
    public int currentScore;
    public int levelsCompleted;

    public int lives;
    public String currentSpot;


    private BufferedWriter writer;
    private BufferedReader reader;

    private DataInputStream dataIn;
    private DataOutputStream dataOut;

    public Player(){
        currentScore = 0;
        levelsCompleted = 0;
    }

    public int getHiScore(){
        return hiScore;
    }

    public int getScore() {
        return currentScore;
    }

    public int getLevelsCompleted() {
        return levelsCompleted;
    }

    public int getLives() {
        return lives;
    }

    public String getCurrentSpot() {
        return currentSpot;
    }

    public void setHiScore(int hiScore) {
        this.hiScore = hiScore;
    }

    public void setScore(int score) {
        currentScore = score;
    }

    public void setLevelsCompleted(int levelsCompleted) {
        this.levelsCompleted = levelsCompleted;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setCurrentSpot(String currentSpot) {
        this.currentSpot = currentSpot;
    }

    public void writeHiScores(int score, String name){
        boolean isOk = false;
        int toCompare;
        try
        {
            dataOut = new DataOutputStream(new FileOutputStream("hiScores.txt"));
            dataIn = new DataInputStream(new FileInputStream("hiScores.txt"));

            //Checks for whether the New Score should be in the High Scores
            for(int i = 1; i <= 5; i++){
                toCompare = dataIn.readInt();
                if(score>toCompare) {
                    isOk  = true;
                    dataIn.close();
                    break;
                }
            }

        }catch(IOException e){e.printStackTrace();}

    }

    public void writer(){
        try {
            dataOut = new DataOutputStream(new FileOutputStream("hiScores.txt"));

            dataOut.writeInt(2345235);
        }catch (IOException e){e.printStackTrace();}
    }
}