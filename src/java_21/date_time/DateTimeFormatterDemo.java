package java21.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate customDate = LocalDate.of(2020, 01, 01);
        LocalTime customTime = LocalTime.of(20, 30, 15);
        LocalDateTime customDateTime = LocalDateTime.of(customDate, customTime);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy hh:mm:ss");
        System.out.println("Formatted date: " + df.format(customDateTime));
        DateTimeFormatter ISOdf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("Formatted date: " + ISOdf.format(customDateTime));
        DateTimeFormatter ISOdf2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Formatted date: " + ISOdf2.format(customDateTime));

    }
}
