package tekrar;

import java.util.Scanner;

public class _04_ArrayTekrar {
    public static void main(String[] args) {
        // kullanıcıdan 5 tane sayı alın ve bu sayıların tek olanlarının sayısı
        Scanner scan = new Scanner(System.in);
        int [] nums=new int[5];
        int miktar =0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Bir Sayı Girin : ");
            nums[i]= scan.nextInt();

        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==1){
                miktar ++;
            }
        }
        System.out.println("Tek Elemanların Sayısı : "+ miktar);
    }
}
