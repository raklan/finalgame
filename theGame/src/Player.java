import java.io.*;
public class Player {
    public static int hiScore;
    public int Score;
    public int levelsCompleted;
    // public int lives??? 
    public Player(int h, int s, int c)
    {
        hiScore = h;
        Score = s;
        levelsCompleted = c;
    }

    public void setHiScore(int h)
    {
        h = hiScore;
    }

    public int getHiScore()
    {
        return hiScore;
    }

    public void setScore(int s)
    {
        s = Score;
    }

    public int getScore()
    {
        return Score;
    }

    public void setLvlComplete(int c)
    {
        c = levelsCompleted;
    }

    public int getLvlComplete()
    {
        return levelsCompleted;
    }

    // public void levelComplete()
    // {
    // if(*lvl complete variable* = true)
    // {
    // levelsCompleted++;  
    // }
    // }

    // public void score()
    // {
    // //code for when the player accomplishes a task or does a thing that scores points

    // int scoreAmount = //some way to get the score of said task
    // Score += scoreAmount;
    // }

    // public static void saveData()
    // {
    // try{
    // DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("highscore.txt"));
    // dataOut.writeInt(hiScore);
    // dataOut.close();

    // }catch(IOException ex)
    // {
    // System.out.println("there was an error reading from the file");
    // ex.printStackTrace();
    // }
    // }
}