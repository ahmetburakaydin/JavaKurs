package gun13;

import java.util.Locale;
import java.util.Scanner;

public class _10_OrnekSoru {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("girmek istediğiniz isim sayısı : ");
        int girisSayısı=scan.nextInt();
        int i=0;
        int toplamKacTane = 0;
        scan.nextLine();

        while (i<girisSayısı){
            System.out.println("bir isim giriniz");
            String isim=scan.nextLine();
            if (isim.toLowerCase(Locale.ROOT).startsWith("a")){
                toplamKacTane++; // a ile başlayan kelime sayısı  a ile başladıkca artırır , asıl sorulan şey
            }
            i++;
        }
        System.out.println(" "+toplamKacTane+"isim a ile başlıyorç");
    }
}
