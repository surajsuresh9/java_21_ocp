package java21.date_time;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("now: " + localTime);
        System.out.println("hour: " + localTime.getHour());
        System.out.println("min: " + localTime.getMinute());
        System.out.println("sec: " + localTime.getSecond());
        System.out.println("nano sec: " + localTime.getNano());

        // jump
        LocalTime twoHoursAgo = localTime.minusHours(2);
        System.out.println("twoHoursAgo: " + twoHoursAgo);
        LocalTime thirtyMinLater = localTime.plusMinutes(30);
        System.out.println("thirtyMinLater: " + thirtyMinLater);
    }
}
