package gun51.datetime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _01_StringToDateTime {
    public static void main(String[] args) {
        /*String str= "19 05 1990";
        DateTimeFormatter readFormat =DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate strDAte = LocalDate.parse(str,readFormat);

        System.out.println(strDAte.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));*/

        String str1 = "10.23";
        String str2 = "10:23";

        LocalTime str1Time= LocalTime.parse(str1,DateTimeFormatter.ofPattern("HH.mm"));
        LocalTime str2Time= LocalTime.parse(str2,DateTimeFormatter.ofPattern("HH:mm"));

        System.out.println(str1Time.format(DateTimeFormatter.ofPattern("HH.mm")));
        System.out.println(str2Time.format(DateTimeFormatter.ofPattern("HH:mm")));







    }
}
