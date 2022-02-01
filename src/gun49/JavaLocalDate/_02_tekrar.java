package gun49.JavaLocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _02_tekrar {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        /*System.out.println(now);
        System.out.println(now.getNano());*/

        /*DateTimeFormatter format2= DateTimeFormatter.ofPattern("hh:mm:ss");*/
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(now.format(format2));

        System.out.println(now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

    }
}
