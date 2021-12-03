package gun13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random=(int)(Math.random()*100);
        int sayac= 0;
        while (sayac<5) {
            System.out.println("Bir sayı girin :"); // 5 tane sayı istemek için
            int sayi = scan.nextInt();

            if (sayi==random){
                System.out.println("Tebrikler.");
                break; // şartı sağlayınca bitirsin. // sayac bitmeden eşitlik sağlandığı takdirde döngüyü sonlandırmak için
            }
            else if (sayac==4){ // her döngüde değilde haklar bitince yani son hakdan sonra kaybettiğini belirtmek için.
                System.out.println("Kaybettiniz.");
                System.out.println("Random sayı : "+ random);
            }
            sayac++;
        }
    }
}
