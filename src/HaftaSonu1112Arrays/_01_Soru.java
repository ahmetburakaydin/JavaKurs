package HaftaSonu1112Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan 10 tamsayı girişi alın ve bunları bir dizide saklayın ve ekrana yazdırın.
        Scanner scan=new Scanner(System.in);
        int []nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print((i+1)+". Sayiyi Girin : ");
            nums[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(nums));

    }


}
