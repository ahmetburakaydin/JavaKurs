package haftasonu1112Methods;

import java.util.Scanner;

public class _07_soru {
    public static void main(String[] args) {
        // Sayının asal olup olmadığını öğrenmek için bir method tanımlayın
        asalSayıKontrol();
    }
    public static void asalSayıKontrol () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Girin :");
        int  a = scan.nextInt();
        int bölenSayısı = 0;
        for (int i = 2; i <a ; i++) {
            if(a%i==0) {
                bölenSayısı++;
            }
        }
        if(bölenSayısı==0) {
                System.out.println("Sayı Asal Sayıdır.");


        }
        else {
            System.out.println("Sayı Asal Sayı DEĞİLDİR !!! ");
        }
    }


}
