package gun14;

import java.util.Scanner;

public class _03_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi girmesini isteyin ve
         bu sayinin faktoriyelini hesaplayin.
         Faktoriyel => 5 icin = 5*4*3*2*1 dir
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayı girin");
        int num= scan.nextInt();
        double faktoriyel=1;

        for (int i=1;i <= num; i++) {
            faktoriyel*=i;

        }
        System.out.println("faktoriyel sonuc : "+faktoriyel);
    }
}
