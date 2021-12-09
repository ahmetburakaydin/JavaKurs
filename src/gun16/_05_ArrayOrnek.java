package gun16;

import java.util.Scanner;

public class _05_ArrayOrnek {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane pozitif tam sayi girmesini isteyin.
        Bu sayilari bir diziye atin. Bu sayilardan en büyügünü ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 sayı girin");
        int enb =0;
        int[]nums= new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= scanner.nextInt();
            if (nums[i]>enb){
                enb=nums[i];
            }
        }
        System.out.println("en büyük : " + enb);








    }
}
