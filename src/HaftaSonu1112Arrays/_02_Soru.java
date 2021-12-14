package HaftaSonu1112Arrays;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 10 tamsayı girişi alın ve bunları bir dizide saklayın.
        Yine kullanıcıdan bir sayı vermesini isteyin.
        Şimdi kullanıcıya bu sayının dizide olup olmadığını söyleyin.
         */
        Scanner scan=new Scanner(System.in);
        int []nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print((i+1)+". Sayiyi Girin : ");
            nums[i]=scan.nextInt();
        }
        System.out.println("Kontrol Etmek İstediğiniz Sayiyi Giriniz. ");
        int num = scan.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==num){
                System.out.println(num+" num dizisin bir elemanıdır.");

            }

        }




    }

}
