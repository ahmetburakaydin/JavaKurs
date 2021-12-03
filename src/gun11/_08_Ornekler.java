package gun11;

import java.util.Scanner;

public class _08_Ornekler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen Sayı 'Çift'tir.");
        }
        else {
            System.out.println("Girilen Sayı 'Tek'dir");
        }
    }
}
