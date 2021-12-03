package gun11;

import java.util.Locale;
import java.util.Scanner;

public class _05_Ornekler {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("2 Kelimeden oluşan bir metin girin");
        String cumle = scan.nextLine();

        int bosluk = cumle.indexOf(" ");
        String cumle1=cumle.substring(0,bosluk);
        String cumle2=cumle.substring(bosluk+1);

        String ıstenen1=(cumle1.toUpperCase(Locale.ROOT)+" ").concat(cumle2);
        String istenen2=(cumle1+" ").concat(cumle2.toLowerCase(Locale.ROOT));

        System.out.println("1.sorunun cevabı : "+ıstenen1);
        System.out.println("2.sorunun cevabı : "+istenen2);

    }
}
