package gun12;

import java.util.Scanner;

public class _024_WhileLoopOdev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi Girin : "); //girilen sayıya kadar olan sayıların toplamını yazdır sayı dahil.
        int sayi = scan.nextInt();

        int toplam =0;

        while (sayi>0){
            toplam+=sayi; // toplam = toplam+sayi
            sayi--;

        }
        System.out.println("toplam sayılar : "+toplam);

        /*
        Kullanicidan bir sayi isteyin.
        0 ile bu sayi arasindaki sayi dahil toplamini bulun
         */
    }
}
