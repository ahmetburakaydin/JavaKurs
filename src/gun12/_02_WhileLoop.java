package gun12;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("pozitif bir tam sayı girin"); //0 dan girilen sayıya kadar olan tek sayıları yazdır.

        int sayi=scan.nextInt();

        int count = 0;

        while (sayi>0){
            if (sayi%2==1){ // tek sayılar
                System.out.print(sayi+" ");
            }
            sayi--;
        }
    }
}
