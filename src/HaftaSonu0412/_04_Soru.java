package HaftaSonu0412;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Klavyeden girilen herhangi bir sayının faktöriyel değerini bulan bir program yazın
        // Bir sayının faktoriyeli, 1 den o sayıya kadar olan sayıların çarpımıdır
        // input: 5 ise Output: 1*2*3*4*5 = 120 olur

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int num = scan.nextInt();
        int faktoriyel=1;

        for (int i = 1; i <=num ; i++) {
            faktoriyel*=i;
        }
        System.out.println("Faktöriyel Sonuc : "+faktoriyel);
    }
}
