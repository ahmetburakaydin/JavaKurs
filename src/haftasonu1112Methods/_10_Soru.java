package haftasonu1112Methods;


import java.util.Arrays;
import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        //Parametre olarak alacağı bir array'in maximum elemanını return edecek method yazın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int length = scan.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dizi Elemanı girin : ");
            array[i]=scan.nextInt();
        }
        System.out.println(" **Dizinin Maximum Değeri ** :"+arrayMax(array));
    }
    public static int arrayMax (int[] nums ) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        return max;

    }
}
