package gun51.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _02_DateTime {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:MM:ss");

        System.out.println(datetime.format(format));
    }
}
