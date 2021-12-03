package gun11;

import java.util.Locale;
import java.util.Scanner;

public class _07_Ornekler {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("karışık olarak içinde harf ve sayı içeren bir ifade girin.");
        String kelime =scan.nextLine();

        String harfler =kelime.replaceAll("[0-9]","");
        String rakamlar=kelime.toLowerCase(Locale.ROOT).replaceAll("[a-z]","");
        int intRakam=Integer.parseInt(rakamlar);

        System.out.println("harflerden oluşan ifade :"+harfler);
        System.out.println("rakamlardan oluşan ifade :"+intRakam);
    }
}
