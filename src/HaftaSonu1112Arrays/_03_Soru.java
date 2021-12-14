package HaftaSonu1112Arrays;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 20 tamsayı girişi alın ve aşağıdakileri yazdırın:
        pozitif sayıların sayısı
        negatif sayıların sayısı
        tek sayıların sayısı
        çift sayıların sayısı
        0 (sıfır) sayısı.
         */
        Scanner scan = new Scanner(System.in);
        int [] nums=new int[20];
        int pozitif=0;
        int negatif=0;
        int tek=0;
        int çift=0;
        int sıfır = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Bir Sayi Girin : ");
            nums[i]= scan.nextInt();
        }
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]>0){
                pozitif++;
            } if(nums[i]<0){
                negatif++;
            } if(nums[i]%2==1){
                tek++;
            } if (nums[i]%2==0){
                çift++;
            } if (nums[i]==0){
                sıfır++;
            }

        } System.out.println("Pozitif Sayiların Sayısı : "+pozitif);
          System.out.println("Negatif Sayiların Sayısı : "+negatif);
          System.out.println("Tek Sayiların Sayısı : "+tek);
          System.out.println("Çift Sayiların Sayısı : "+çift);
          System.out.println("Sıfır Sayısı : "+sıfır);
    }
}
