package gun7;

import java.util.Scanner;

public class _02ÖrnekStringMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İsminizi Yazın : ");
        String isim = scanner.nextLine();
        String isimİlkHarf=isim.substring(0,1);

        int bosluk=isim.indexOf(" ");
        String soyisimİlkHarf=isim.substring(bosluk+1,bosluk+2);

        System.out.println(isimİlkHarf+". "+soyisimİlkHarf+".");



        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("isminiz : ");
        String isim=scanner.next();

        System.out.println("soyisminiz");
        String soyisim=scanner.next();

        String isim2 = isim.charAt(0)+ ". ";
        String soyisim2 = soyisim.charAt(0)+".";

        System.out.println((isim2.concat(soyisim2)));

         */







        /*
        System.out.println("Doğum Yılınız : ");
        String dogum =scanner.next();
        System.out.println(dogum.isEmpty());

         */


        /*
        System.out.println("İsminiz : ");
        String cumle5=scanner.nextLine();
        System.out.println("isim : "+cumle5);
        System.out.println(cumle5.startsWith("A"));

        System.out.println("Soy Isminiz : ");
        String cumle6 =scanner.nextLine();
        System.out.println(cumle6.endsWith("k"));

         */

    }
}
