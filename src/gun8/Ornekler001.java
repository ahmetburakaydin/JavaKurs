package gun8;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.Locale;
import java.util.Scanner;

public class Ornekler001 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Çemberin Yarıçapını yazın : ");

        double yarıCap = scanner.nextDouble();
        double pi = 3.14;
        double cemberCevre = 2*pi*yarıCap;
        System.out.println("Çemberin Cevresi :"+ cemberCevre);

        double kareKenar = cemberCevre;
        double kareAlan = (int) kareKenar*kareKenar;        /*
        System.out.println("İsim ve Soyisminizi Girin :");
        String tamAd=scanner.nextLine();

        int bosluk =tamAd.indexOf(" ");
        String isim=tamAd.substring(0,bosluk);
        String soyisim=tamAd.substring(bosluk+1);

        System.out.println(isim.toLowerCase(Locale.ROOT));

        String soyisimİlkHarf =soyisim.substring(0,1).toLowerCase(Locale.ROOT);
        String soyisimKalan =soyisim.substring(1).toUpperCase(Locale.ROOT);

        String soyIsımSon = soyisimİlkHarf.concat(soyisimKalan); System.out.println(soyIsımSon);

         */

        /*
        Scanner scanner =new Scanner(System.in);
        System.out.println("Doğum Yılınızı Yazın :");
        int dogumYıl = scanner.nextInt();
        System.out.println(dogumYıl);
        System.out.println("Su anki Yıl :");
        int suankiYıl= scanner.nextInt();

        int yas = suankiYıl-dogumYıl;
        System.out.println("Yaşınız : "+yas);

         */
    }
}
