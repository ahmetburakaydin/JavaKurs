package gun17;

import java.util.Scanner;

public class _010_ArrayOrnek {
    public static void main(String[] args) {
         /*
        Kullanicidan 5 tane sayi isteyin.
        Bu sayilardan ortalamayi gecen sayi miktarini bulun.
         */
        Scanner scan =new Scanner(System.in);
        int [] sayilar = new int[5];
        int gecenSayılar = 0 ;
        int toplam=0;
        int ortalama;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Bir Sayı Girin");
            sayilar[i]=scan.nextInt();
            toplam+=sayilar[i];

        }
        ortalama = toplam/sayilar.length;
        /*
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i]>ortalama) {
                gecenSayılar++;
            }
        }

         */
        for(int sayi : sayilar) {
            if (sayi>ortalama){
                gecenSayılar++;
            }
        }
        System.out.println("Ortalamayı Gecen Sayılar = "+gecenSayılar);
    }
}
