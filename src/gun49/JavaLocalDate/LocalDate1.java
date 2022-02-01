package gun49.JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDate1 {

    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);

        LocalDate date1=LocalDate.of(1453,5,29);
        LocalDate date2=LocalDate.of(2023, Month.MARCH,19);

        System.out.println(date1.getDayOfWeek());

        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(format));*/

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        Locale [] locales =Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println(locale);
        }
        Locale tr = new Locale("de","De");

        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(tr)));




    }
}

