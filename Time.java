package cscilab1; 

import java.util.Locale;

public class Time { 
    
    private int hour; 
    
    private int minute; 
    
    private int second; 
    
    public int getHour() { 
        return hour;
    }
    public int getMinute() { 
        return minute;
    }
    public int getSecond() { 
        return second;
    }
    public void setHour(int h) { 
        if (h>=0 && h<=23) { 
            hour = h; 
        } else { 
            hour =0; 
        }
    } 
    public void setMinute(int m) { 
        if (m>=0 && m <=59) { 
            minute = m; 
        } else { 
            minute = 0; 
        } 
    } 
    public void setSecond(int second) { 
        if (second>=0 && second<=59) { 
            this.second =second; 
        } else { 
            this.second =0; 
        }
    } 
    public void setTime (int h, int m, int s) { 
        setHour(h); 
        setMinute(m); 
        setSecond(s);
    }
    public Time() { 
        hour =0; 
        minute =0; 
        second =0; 
    }
    public Time (int h ,int m ,int s) { 
        setTime(h, m, s);
    }
    public Time (Time other) { 
        hour = other.hour; 
        minute = other.minute; 
        second = other.second; 
    } 
    public String toString() { 
        return String.format("%02d:%02d:%02d\n", hour, minute, second);
    }

    public boolean equals(Time other) { 
        return hour == other.hour && minute == other.minute && second == other.second;
    }
    
}
