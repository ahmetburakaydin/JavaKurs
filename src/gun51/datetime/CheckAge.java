package gun51.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CheckAge {
    public static void main(String[] args) {
        System.out.println(checkAge("19/05/1990"));
    }
    public static int checkAge(String dob){
        LocalDate date=LocalDate.now();
        LocalDate date1= LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        return Period.between(date,date1).getYears();
    }
}
