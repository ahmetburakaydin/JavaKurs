package gun26;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Bir sayı girin : ");
           sayi= scan.nextInt();
            toplam+=sayi;
        }
        double ortalama = (double) toplam/10;
        System.out.println("Sayıların ortalaması : "+ortalama);



    }
}
