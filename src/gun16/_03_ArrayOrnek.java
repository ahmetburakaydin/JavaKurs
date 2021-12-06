package gun16;

import java.util.Scanner;

public class _03_ArrayOrnek {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayi alarak bu sayi uzunluğunda int bir array oluşturun.
        Dizinin elemanlarını kullanıcının gireceği sayılarla doldurun.
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Dizinin eleman sayısı  kaç olsun ? :");
        int num=scan.nextInt();
        int[]nums =new int[num];
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Elemanarı girin : ");
            nums[i]=scan.nextInt();
        } for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
