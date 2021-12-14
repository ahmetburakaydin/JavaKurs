package gun21;

import java.util.Scanner;

public class _03_MethodsExample {
    public static void main(String[] args) {
        /*
         Bir ögrencinin ismini aldigi notlarin ortalamasini bulan bir metot yazin.
         (Kac not aldigi belli degil)
         */
        ortalama("Ahmet",30,40,60,100);
        ortalama("Burak",100,100,100,100);
        ortalama("Aydın",90,90,90,90);


    }
    public static void ortalama(String name,int... notlar) {

        int toplamNot=0;
        for (int i = 0; i < notlar.length; i++) {
            toplamNot+=notlar[i];
            
        }
        int ortalama = toplamNot/notlar.length;
        System.out.println("Öğrenci  "+name+" Sınavlardan Ortalama " + ortalama+" sonucu almıştır.");

    }
}
