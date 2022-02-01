package gun51.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class _01_Periyod {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 = LocalDate.of(1990,5,19);

        Period period = Period.between(date1,date2);
        System.out.print(period.getYears()+" "+ period.getMonths()+" "+ period.getDays());
        System.out.println();

        date1.plusDays(1);
        date1.plusWeeks(1);
        date1.plusMonths(1);
        date1.plusYears(1);

        date2.minusDays(1); // plusDays(-1)
        date2.minusWeeks(1);
        date2.minusMonths(1);
        date2.minusYears(1);

        System.out.println(date2.plusYears(31).plusMonths(8).plusDays(12));

        Period p = Period.ofDays(1);


        date1.plus(p);
        System.out.println(date1);
    }
}
