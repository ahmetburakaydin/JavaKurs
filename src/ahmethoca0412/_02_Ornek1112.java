package ahmethoca0412;

import java.util.Arrays;

public class _02_Ornek1112 {
    public static void main(String[] args) {
        // tanımlanmış bir int arrayin max ve min değerlerini  başka bi arraye  atiniz.

        int [] nums = {11,22,33,44,55};//
        int enK=nums[nums.length-1];  // int enK=Integer.MAX_VALUE;
        int enB=nums[0];              // // int enB=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>enB){
                enB=nums[i];
            }
            else if(nums[i]<enK){
                enK=nums[i];
            }

        }
        int [] enKB = {enK,enB};
        System.out.println(Arrays.toString(enKB));
    }
}
