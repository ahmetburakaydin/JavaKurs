package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _042_ArrayList {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir  Sayı Girin : ");
            nums[i] = scan.nextInt();
        }
        System.out.println(ciftSayilar(nums));
    }

    public static ArrayList<Integer> ciftSayilar(int[] nums) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {

                sayilar.add(nums[i]);
            }

        }
        return sayilar;
    }
}

