
/**
 * Write a description of class Timec here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Timec
{
    private int hour ;
    private int minute;
    private int second;
    
    
    
    public Timec(int h, int m, int s)
    {
        setSecond(s);
        setMinute(m);
        setHour(h);
       
    }

    
     //מתודה שקוראת לשדה hour    
    public int getHour(){
        
        return hour;
    }
     //מתודה שקולטת לפרמטר h  ומציבה בשדה  hour אם תקין         
    public void setHour(int h)
        {
          
          if (h >=1 && h <=24)
          hour = h;
          
          else 
          hour=0;
          
        }
        
        
     //מתודה שקוראת לשדה minute    
    public int getMinute() 
    {
        
        return minute;
    }
    //מתודה שקולטת לפרמטר m  ומציבה בשדה  month אם תקין         
    public void setMinute(int m)
        {

          if (m >=1 && m<=59)
          minute=m;
          
          else 
          minute =0;
          
        }

    
     //מתודה שקוראת לשדה second    
    public int getSecond()
    {
        return second;
    }
     //מתודה שקולטת לפרמטר s  ומציבה בשדה  second אם תקין         
    public void setSecond(int s)
    {
     if (s >=1 && s<=59)
          second=s;
          
        else 
          minute =0;
             
    }
    
    public void setTime(int h, int m, int s)
    {
    setSecond(s);
    setMinute(m);
    setHour(h);
    }
    
}
