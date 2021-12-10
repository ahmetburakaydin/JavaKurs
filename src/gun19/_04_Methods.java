package gun19;

import java.util.Scanner;

public class _04_Methods {
    public static void main(String[] args) {
        /*
        6 elemanlı bir dizi oluşturun ve bu dizideki  tek ve çift  sayı eleman
        sayisini bulan bir metot yazın
        */

        int [] nums={11,22,33,44,55,77};
        tekCiftSayılar(nums);

    }
    public static  void tekCiftSayılar(int[]array){
        int tekSayı=0;
        int ciftSayi=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1) {
                tekSayı++;
            } else {
                ciftSayi++;
            }

        } System.out.println("Tek eleman sayısı :"+tekSayı+"Cift Eleman Sayısı :"+ciftSayi);

    }
}
