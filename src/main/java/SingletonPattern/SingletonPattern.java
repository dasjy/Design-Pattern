package SingletonPattern;

public class SingletonPattern
{
    private static CandyMaker patternInstance=null;
    private SingletonPattern()
    {
        if(patternInstance==null)
        {
            throw new RuntimeException ("you suppose to call the getInstance() method");
        }
    }


    public static CandyMaker getInstance()
    {
        if(patternInstance==null)
        {
            patternInstance=new CandyMaker();
        }
        return patternInstance;
    }
}
