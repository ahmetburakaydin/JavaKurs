package gun49.JavaLocalDate;

import javax.crypto.spec.PSource;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalTime1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        for (int i = 0; i < 1000; i++) {
            /*System.out.println(time);*/
        }

        LocalTime time1= LocalTime.of(12,34,57);
        /*System.out.println(time1);
*/
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("hh:mm:ss a");


        /*System.out.println(time.format(format1));*/

        System.out.println(time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
    }


}
