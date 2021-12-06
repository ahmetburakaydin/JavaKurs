package gun12;

import java.util.Locale;
import java.util.Scanner;

public class _012_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bugün haftanın hangi günü");
        String day=scan.nextLine();
        String day1=day.toLowerCase(Locale.ROOT);

        switch (day1) {
            case "pazartesi" :
                System.out.println("1.gün");
                break;
            case "salı" :
                System.out.println("2.gün");
                break;
            case "çarşamba" :
                System.out.println("3.gün");
                break;
            case "perşembe" :
                System.out.println("4.gün");
                break;
            case "cuma" :
                System.out.println("5.gün");
                break;
            case "cumartesi" :
                System.out.println("6.gün");
                break;
            case "pazar" :
                System.out.println("7.gün");
                break;
            default:
                System.out.println("geçersiz işlem");


        }
    }
}
