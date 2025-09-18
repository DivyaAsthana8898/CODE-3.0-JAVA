
import java.util.Calendar;
import java.util.GregorianCalendar;

public class problem16 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get( Calendar.HOUR));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2025));
    }
    
}
