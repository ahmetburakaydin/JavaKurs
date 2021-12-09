package tekrar;

import java.util.Scanner;

public class _06_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi girmesini isteyin.
        Bu sayilardan yüzler basamagi en büyük olan sayiyi bulun.
         */

        Scanner scan=new Scanner(System.in);
        int []nums =new int[5];

        int yuzlerEnb=0;


        for (int i = 0; i < nums.length; i++) {
            System.out.println("Bir Sayı Girin");
            nums[i]= scan.nextInt();
        }

        for (int num : nums){
            int yuzler =(num/100)%10;
            if (yuzler>yuzlerEnb){
                yuzlerEnb=yuzler;
            }
        }
        System.out.println("Sayılardan Yüzler Basamağı En Büyük Sayının Yüzler Basamağındaki Sayı : "+yuzlerEnb);
    }
}
