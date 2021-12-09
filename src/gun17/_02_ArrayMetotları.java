package gun17;

import java.util.Arrays;

public class _02_ArrayMetotları {
    public static void main(String[] args) {
        /*
        5 elamanli bir int dizi olusturun ve ekrana yazdirin.
         */
        int [] nums = {1,2,3,4,6};
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
            
        }
    }
}
