import java.io.*;
import java.util.ArrayList;

public class Player {

    public int topScore;
    public int currentScore;

    public Score[] hiScores = new Score[4];

    public int lives;

    private BufferedWriter writer;
    private BufferedReader reader;

    private DataInputStream dataIn;
    private DataOutputStream dataOut;

    public Player(){
        currentScore = 0;
        for(int i = 0; i<hiScores.length; i++){
            hiScores[i] = new Score("No Name", 0);
        }
    }

    public int getTopScore(){
        return topScore;
    }

    public int getScore() {
        return currentScore;
    }

    public int getLives() {
        return lives;
    }

    public void setTopScore(int hiScore) {
        this.topScore = hiScore;
    }

    public void setScore(int score) {
        currentScore = score;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void addHiScore(Score s){
        for(int i = 0; i<hiScores.length; i++){
            if(s.getHiScore()>hiScores[i].getHiScore()) {
                for(int k = 3; k>=i-1; k--){
                    if(k==-1)
                        break;
                    hiScores[k+1] = hiScores[k];
                }
                hiScores[i] = s;
            }
        }
    }

    public Score[] getHiScores() {
        return hiScores;
    }

    public void readHiScores(){
        try {

            reader = new BufferedReader(new FileReader("hiScores.txt"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}