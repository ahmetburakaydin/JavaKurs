package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Methods {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin.
        Bu sayilardan en büyügünü ve en kücügünü bulan iki farkli metot yazin.
         */
        Scanner scan = new Scanner(System.in);
        String sayilarCumle = scan.nextLine();

        sayilarıDiziyeEkleme(sayilarCumle);

    }
    public static void sayilarıDiziyeEkleme (String sayılarParametre){
        String[] sayilar=sayılarParametre.split(" ");

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println("En Kücük Eleman : "+ sayilar[0]+"En Büyük Eleman : "+sayilar[sayilar.length-1]);
    }
}
