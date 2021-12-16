package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 10 tane sayi girmesini isteyin.Bu sayilardan çift sayı olanları
        bir dizi içine atın.çiftSayılar() diye metot oluşturun.
         */



        int [] nums=new int[10];
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println(ciftSayilar(nums));
    }
    public static int[] ciftSayilar(int[]nums){
        ArrayList<Integer> sayilar = new ArrayList<>();
        nums =new int[10];
        for (int i = 0; i < nums.length; i++) {
            Scanner scan =new Scanner(System.in);
            System.out.println("Bir  Sayı Girin : ");
            nums[i]=scan.nextInt();

        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==0){

                sayilar.add(nums[i]);
            }

        }

        return nums;
    }
}
