package gun17;

import java.util.Arrays;

public class _03_ArrayMetotları {
    public static void main(String[] args) {
        //5 elemanlı bir dizi  oluşturun ve  elemanları küçükten  büyüğe  sıralayın.
        int[] nums = {56,12,34,23,45};
        System.out.println(" sort()dan önce "+Arrays.toString(nums));
        Arrays.sort(nums);
        // sort() metodun  dizinin  elemanlarını küçükten büyüğe sıralar.
        System.out.println("sort()dan sonra "+Arrays.toString(nums));

    }
}
