
import java.util.Calendar;

 class practice16 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

    }

    
}
