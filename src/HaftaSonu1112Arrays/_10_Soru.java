package HaftaSonu1112Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        //Kullanıcı tarafından belirlenen öğelerin sayısı olan bir tamsayı dizisi düşünün.
        // Öğeler ayrıca kullanıcıdan girdi olarak alınır.
        //Tüm eleman çiftleri arasında maksimum ve minimum farka sahip olan
        // eleman çiftini bulan bir program yazın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array length : ");
        int elemanSayisi=scan.nextInt();
        int[] array=new int[elemanSayisi];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number : ");
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        int maxFark=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] - array[j]) > maxFark) {
                    maxFark = Math.abs(array[i] - array[j]);
                }
            }
        }
        int minFark=Integer.MAX_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1]-array[i]<minFark){
                minFark=array[i+1]-array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Minimum Fark "+minFark);
        System.out.println("Maximum Fark "+maxFark);
        }





    }



