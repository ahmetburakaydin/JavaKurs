package tekrar;

import java.util.Arrays;

public class _010_ArrayTekrar {
    public static void main(String[] args) {
         /*
        5 elamanli bir int dizi olusturun ve ekrana yazdirin.
         */

        int[] nums = {23,34,45,56,67};
        //1.yöntem
        System.out.println(Arrays.toString(nums));

        //2.yöntem
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");

        }

    }
}
