
/**
 * Write a description of class Datec here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Datec
{
    private int day;
    private int month;
    private int year;
    
        
                        //מתודה שבודקת אם הערכים תקנים לפי הדרישות ומחזירה 1/0.    
    private boolean checkdate(int d,int m, int y)
    {
    if (m==1||m==3||m==5||m==7||m==8||m==10||m==12 && d>0 && d<32)
    return true;
    

    else if (m==4||m==6||m==9||m==11 && d>0 && d<31)
    return true;
    
    else if (m==2 && d>0 && d<29)
        return true;
        
    else if(m==2 && d==29 && y%100/4%100==0 || y/4%100==0)
        return true;
    
    else 
    return false;
    
    }
    
    
    //מתודה שקוראת לשדה day.   
    public int getDay()
    {
        return day;
    }
    //מתודה שקוראת לשדה month    
    public int getMonth()
    {
        return month;
    }
    //מתודה שקוראת לשדה year    
    public int getYear()
    {
        return year;
    }
    
    //מתודה שקולטת לפרמטרים ומציבה בשדות הנתונים התקנים          
    public void setDate(int d, int m, int y)
    {
    
    if (checkdate(d ,m, y) == true )
    {
    day =d;
    month=m;
    year=y;
    }
    
    else 
    {
    day =1;
    month=1;
    year=2000;    
    }
    
    }
}
