package java21.date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MIN: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
        System.out.println("TIME: " + calendar.getTime());

        DateFormat df1 = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
        System.out.println("DATE: " + df1.format(new Date().getTime()));

        DateFormat df2 = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        System.out.println("DATE: " + df2.format(new Date().getTime()));

        Calendar birthdate = Calendar.getInstance();
        birthdate.set(1994, Calendar.JANUARY, 24);
        System.out.println(birthdate.getTime());

        System.out.println(birthdate.get(Calendar.YEAR));

        // jump dates
        birthdate.add(Calendar.YEAR, 10);
        System.out.println(birthdate.get(Calendar.YEAR));
    }
}
