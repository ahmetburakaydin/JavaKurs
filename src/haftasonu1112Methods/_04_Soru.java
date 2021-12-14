package haftasonu1112Methods;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen iki sayının toplamını kendi metodunuzu tanımlayarak ekrana yazdıran programı
        //yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi Girin : ");
        int num1= scan.nextInt();
        System.out.println("Bir Sayi Girin : ");
        int num2= scan.nextInt();
        toplam(num1,num2);

    }
    public static void toplam(int a , int b ){
        int toplam1;
        toplam1=a +b;
        System.out.println("Sayıların Toplamı :"+toplam1);
    }
}
