package gun20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_OverLoadMethod {
    public static void main(String[] args) {
        // öyle bir metot yazınki kullanıcı 2 3 ve 4 sayının toplamını bu metotla yapabilsin.
        Scanner scan= new Scanner(System.in);
        System.out.println("sayi girin : ");
        toplama(45,56,67);  // toplama metodu overload 1 den fazla tanımlanmış ama overload olmuş bir metotdur.
        toplama(1,2);
        toplama(5,15,25,45);

        // ayni isimde ve ayni işi yapan ama parametre sayisi farklı  olan metotlara
        // overload metot denir.

    }
    public static void toplama(int sayi1,int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("toplam : "+toplam);
    }
    public static void toplama(int sayi1,int sayi2,int sayi3){
        int toplam=sayi1+sayi2+sayi3;
        System.out.println("toplam : "+toplam);
    }
    public static void toplama (int sayi1,int sayi2,int sayi3,int sayi4){
        int toplam = sayi1+sayi2+sayi3+sayi4;
        System.out.println("toplam : "+toplam);
    }
}
