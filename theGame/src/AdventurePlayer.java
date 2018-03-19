
/**
 * Write a description of class AdventurePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdventurePlayer extends Player
{
    public AdventurePlayer(int hs, int s, int lc)
    {
        super(hs,s,lc);
    }
    
    public void setHighScore(int hs)
    {
        hs = hiScore;
    }

    public void setScore(int s)
    {
        s = Score;
    }

    public void setLevelsCompleted(int l)
    {
        l = levelsCompleted;
    }

    public int getHighScore()
    {
        return hiScore;
    }
    
    public int getScore()
    {
        return Score;
    }
    
    public int getLevelsCompleted()
    {
        return levelsCompleted;
    }
}
