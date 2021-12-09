package tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class _12_ArrayTekrar {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı alın ve en büyüğünü yazdırın
        Scanner scan = new Scanner(System.in);
        int []nums = new int[5];        // nums u 5 elemanlı bir dizi olarak tanımladık
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Bir sayi girin :");
            nums[i]= scan.nextInt();        // eleman sayısı kadar sayı girişiyle elemanları oluşturduk.
        }
        Arrays.sort(nums); // kücükten büyüğe sıraladık.
        System.out.println("En Büyük Sayi :"+nums[nums.length-1]); // sıraladıktan sonraki sonuncu
                                                                   // yani en büyük elemanı yazdırdık
    }
}
