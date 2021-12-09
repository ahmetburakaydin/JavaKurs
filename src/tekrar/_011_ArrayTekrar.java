package tekrar;

import java.util.Arrays;

public class _011_ArrayTekrar {
    public static void main(String[] args) {
        //5 elemanlı bir dizi  oluşturun ve  elemanları küçükten  büyüğe  sıralayın.
        int[] nums = {56,12,34,23,45};
        System.out.println(Arrays.toString(nums)); // Arrays.sort dan önce
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // Arrays.sort dan sonra
    }
}
