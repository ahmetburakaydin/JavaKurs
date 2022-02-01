package gun49.JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class _01_tekrar {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        /*System.out.println(now);*/

        LocalDate date1 = LocalDate.of(1990, 5, 19);
        LocalDate date2 = LocalDate.of(2019, Month.JUNE, 1);
        LocalDate date3 = LocalDate.of(1992, Month.AUGUST, 6);

        /*System.out.println(date1.getDayOfWeek());
        System.out.println(date2.getDayOfWeek());
        System.out.println(date3.getDayOfWeek());*/

        /*DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yy");*/
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d/M/yy");
        /*System.out.println(date1.format(format1));*/

        /*System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));*/

        /*System.out.println(date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));*/

        Locale[] locales = Locale.getAvailableLocales();

        /*for (Locale locale : locales) {
            System.out.println(locale);
        }*/

        Locale tr = new Locale("tr","TR");

        System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(tr)));



    }
}
