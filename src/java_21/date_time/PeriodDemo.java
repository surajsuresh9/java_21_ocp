package java21.date_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        Period period = Period.of(5, 12, 1);
        System.out.println(period);
        Period period1 = Period.between(LocalDate.now(), LocalDate.now().minusDays(3));
        System.out.println(period1);
    }
}
