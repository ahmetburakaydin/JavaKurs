package gun11;

import java.util.Scanner;

public class _011_Ornek {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("3 tamsayi giriniz : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int enBuyuk = num1;     //Integer.MIN_VALUE;
        int enKucuk = num1;    // Integer.MAX_VALUE;

        if (num2 > enBuyuk)
            enBuyuk = num2;    // if conditionda 1 satir kullanilirsa { paranteze gerek yoktur
        if (num3 > enBuyuk)
            enBuyuk = num3;


        if (num2 < enKucuk) enKucuk = num2;
        if (num3 < enKucuk) enKucuk = num3;

        System.out.println("En Büyük : " + enBuyuk);
        System.out.println("En Kücük : " + enKucuk);
    }

}
