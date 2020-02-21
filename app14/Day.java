import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {
    public static void main(String args[]) {
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        
        int day = c.get(Calendar.DAY_OF_MONTH);
        day +=100;
        //Calendar c = new Calendar(DAY_OF_MONTH);
        //c = getDate(DAY_OF_MONTH, now);
        //Date c += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date future = c.getTime();
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
        //String future = f.getCalendar(c);
        System.out.println(f.format(future));

        
    }
}