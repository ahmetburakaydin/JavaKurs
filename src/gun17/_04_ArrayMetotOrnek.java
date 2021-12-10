package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayMetotOrnek {
    public static void main(String[] args) {
        // kullanıcıdan 5 sayı alın ve en büyüğünü yazdırın
        Scanner scan= new Scanner(System.in);
        int [] nums = new int[5];

        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Bir Sayı Girin");
            nums[i]=scan.nextInt();
        }
        Arrays.sort(nums);  // küçükten büyüğe sıralayıp
        int enb=nums[nums.length-1]; // sonuncu indisi yazırıyoruz
        System.out.println("enb ="+enb);


    }
}
