package tekrar;

import java.util.Scanner;

public class _03_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int []nums=new int[5];
        int enb=0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Pozitif Bir Tam Sayı Girin : ");
            nums[i]=scan.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>enb){
                enb=nums[i];
            }

        }
        System.out.println("dizin en büyük elemanı : "+enb);
    }
}
