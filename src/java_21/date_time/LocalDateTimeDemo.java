package java21.date_time;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);
        System.out.println("year: " + now.getYear());
        System.out.println("month: " + now.getMinute());
        System.out.println("day: " + now.getDayOfYear());
        System.out.println("hour: " + now.getHour());
        System.out.println("min: " + now.getYear());
        System.out.println("sec: " + now.getSecond());

        // jump
        LocalDateTime twoDaysAgo = now.minusDays(2);
        System.out.println(twoDaysAgo);
    }
}
