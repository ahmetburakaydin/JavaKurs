package tekrar;

import java.util.Scanner;

public class _08_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi isteyin.
        Bu sayilardan ortalamayi gecen sayi miktarini bulun.
         */
        Scanner scan=new Scanner(System.in);
        int [] nums=new int[5];
        int toplam=0;
        int miktar=0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Bir Sayi Girin : ");
            nums[i]= scan.nextInt();
            toplam+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int ortalama = toplam/ nums.length;
            if(nums[i]>ortalama){
                miktar++;
            }

        } System.out.println("Ortalamayı Geçen Sayı Miktarı : "+miktar);

    }
}
