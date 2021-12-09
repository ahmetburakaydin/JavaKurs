package gun17;

import java.util.Scanner;

public class _08_ArrayOrnek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] array =new int[5];
        int enb=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayı girin");
            array[i]= scan.nextInt();
        }

        for (int sayi :array) {
            int yuzler = (sayi/100)%10;
            if(yuzler>enb){
                enb=yuzler;
            }

        }
        System.out.println("enb = "+ enb);
    }
}
