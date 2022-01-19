package gun36.ternary;

import java.util.Scanner;

public class Ternary_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 6;
        String sonuc = (num % 2 == 0) ? " Sayi 2'ye Bölünür " : (num % 3 == 0) ? " Sayı 3 e Bölünür " : " 2 veya 3 e Bölünmez";
        System.out.println(sonuc);
    }
}
