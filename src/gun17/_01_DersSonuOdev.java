package gun17;

import java.util.Scanner;

public class _01_DersSonuOdev {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        /*
        soru1:
        Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
                Bu ögrencilere seviye belirleme sinavi yaptiniz.
                Aldiklari sonuclar su sekildedir: 80,85,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:
         */



        String [] isimler = new String[5];
        int [] notlar = {80,85,90,96,100};

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Öğrencinin Isim ve Soyismini Girin : ");
            isimler[i]= scan.nextLine();
        }
        for (int i = 0; i < isimler.length; i++) {
            System.out.println("öğrenci "+isimler[i]+" sinavdan "+notlar[i]+" almıştır.");
        }

    }
}
