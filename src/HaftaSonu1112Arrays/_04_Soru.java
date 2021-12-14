package HaftaSonu1112Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan 10 tamsayı alın ve bunları bir dizide saklayın.
        //Şimdi, tüm öğeleri başka bir diziye ters sırada
        //kopyalayın.
        Scanner scan=new Scanner(System.in);
        int [] nums = new int[10];
        int [] revArray = new int[10];
        for (int i = 0; i < nums.length ; i++) {
            System.out.print("bir tamsayi girin :");
            nums[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < revArray.length; i++) {
            revArray[i]=nums[nums.length-1-i];

        }System.out.println(Arrays.toString(revArray));

    }
}
