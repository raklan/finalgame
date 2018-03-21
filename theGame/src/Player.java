import java.io.*;
import java.util.ArrayList;
public abstract class Player {
    public int hiScore;
    public int Score;
    public int levelsCompleted;
    public Player()
    {
        hiScore = 0;
        Score = 0;
        levelsCompleted = 0;    
    }
    
    public int getHiScore()
    {
        return hiScore;
    }
    
    public void setHiScore(int hs)
    {
        hiScore = hs;
    }
    
    public int getScore()
    {
        return Score;
    }
    
    public void setScore(int s)
    {
        Score = s;
    }
    
    public int getLevelsCompleted()
    {
        return levelsCompleted;
    }
    
    public void setLevelsCompleted(int lc)
    {
        levelsCompleted = lc;
    }

}
