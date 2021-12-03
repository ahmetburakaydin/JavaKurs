package gun12;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        // girilen 5 sayıdan en büyük olanı yazdırın.

        int enb = 0;
        int i = 0;

        while (i<5){
            System.out.println("Bir sayi girin : ");
            int num = scan.nextInt();

            if (num<enb){
                enb=num;
            }
            i++;
        }
        System.out.println("enb : "+enb);
    }
}
