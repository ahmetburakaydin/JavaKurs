package gun11;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("1-9 Arasında bir sayı girin.");
        int sayi=scan.nextInt();

        int randomSayı = (int) (Math.random()*10);

        if (sayi==randomSayı){
            System.out.println("Tebrikler");
        }
        else{
            System.out.println("Kaybettiniz");
        }
    }
}
