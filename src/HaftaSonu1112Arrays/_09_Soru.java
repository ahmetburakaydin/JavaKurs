package HaftaSonu1112Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir dizi alın. Diziyi ortadan bölün ve öğeleri iki farklı dizide saklayın.
        //Örneğin.- girilen dizisi: 58, 24, 13, 15, 63, 9, 8, 81, 1, 78,
        //Böldükten sonra:
        //58, 24, 13, 15, 63
        //9, 8, 81, 1, 78

        Scanner scan = new Scanner(System.in);
        int [] nums = new int[10];
        int [] numsBas=new int[5];
        int [] numsSon=new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Bir sayi girin : ");
            nums[i]=scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            numsBas[i]=nums[i];
        }
        for (int i = 0; i < 5; i++) {
            numsSon[i]=nums[nums.length-1-i];

        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsBas));
        System.out.println(Arrays.toString(numsSon));


    }
}
