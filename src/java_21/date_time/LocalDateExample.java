package java21.date_time;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        System.out.println("Current date: " + LocalDate.now());
        System.out.println("Year: " + LocalDate.now().getYear());
        System.out.println("Month: " + LocalDate.now().getMonth());
        System.out.println("Day of Year: " + LocalDate.now().getDayOfYear());
        System.out.println("Day of Month: " + LocalDate.now().getDayOfMonth());
        System.out.println("Day of Week: " + LocalDate.now().getDayOfWeek());

        // jump
        LocalDate now = LocalDate.now();
        LocalDate fourDaysAgo = now.minusDays(4);
        System.out.println("fourDaysAgo: " + fourDaysAgo);
        System.out.println("now: " + now);

    }
}
