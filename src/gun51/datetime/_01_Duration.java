package gun51.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class _01_Duration {
    public static void main(String[] args) {
        LocalTime time1= LocalTime.now();

        LocalTime time2= LocalTime.now(ZoneId.of("Asia/Singapore"));

        Duration duration = Duration.between(time1,time2);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toHours());
        System.out.println(duration.toMillis());
    }
}
