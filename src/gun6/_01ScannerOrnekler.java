package gun6;

import java.util.Scanner;

public class _01ScannerOrnekler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //4.) Su an ki yili ve dogum tarihinizi ekrandan
        // alip yasinizi hesaplayin.

        System.out.println("Su an ki yil");
        int yil = scanner.nextInt();
        System.out.println("Dogum yili");
        int dogumYili = scanner.nextInt();

        int yas = yil-dogumYili;
        System.out.println("yas = " + yas);

        /*
        System.out.println("Dikdörtgenin Uzun Kenarı : ");
        int uzun =scanner.nextInt();

        System.out.println("Dikdörtgenin Kısa Kenarı : ");
        int kısa =scanner.nextInt();

        int cevre = 2*(uzun+kısa);

        System.out.println("Dikdörtgenin Cevresi = "+ cevre);

         */


        /*
        System.out.println(" iki kelimelik cümle yazın : ");
        String cümle = scanner.nextLine();
        System.out.println("cümle = " + cümle);

        int ilkİndex =cümle.indexOf(" ");
        String ilkKelime =cümle.substring(0,ilkİndex);
        String sonKelime = cümle.substring(ilkİndex+1);

        System.out.println(sonKelime+" "+ilkKelime);

         */


       /*  System.out.println("1.Kelime : ");
        String birinci = scanner.next();

        System.out.println("2.Kelime : ");
        String ikinci = scanner.next();

        System.out.println("Yerleri değişmiş hali : "+ ikinci+" "+birinci);

        */





    }
}
