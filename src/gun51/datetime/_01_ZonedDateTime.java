package gun51.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _01_ZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);


        Set<String> bolgeler = ZoneId.getAvailableZoneIds();
        for (String s : bolgeler) {
            System.out.println(s);
        }

        LocalTime now1 = LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(now1);

        LocalTime now2 = LocalTime.now(ZoneId.of("America/Toronto"));
        System.out.println(now2);
    }
}
