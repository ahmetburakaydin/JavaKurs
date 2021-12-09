package tekrar;

import java.util.Scanner;

public class _16_Array2DTekrar {
    public static void main(String[] args) {
        /*
        ögrencilerin vize ve final notlarini girebilecegi
        bir program yazin. Kac ögrenci olacagini da alin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ogrenci Sayısını girin : ");
        int ogrenciSayısı=scan.nextInt();

        int [][] nums=new int[ogrenciSayısı][2];  // soruda vize ve final notu olarak belirtiği için 2 olarak girilir.

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j==0){
                    System.out.print((i+1)+". Vize Notu : ");
                    nums[i][j]= scan.nextInt();
                }
                else {
                    System.out.print((i+1)+". Final Notu :");
                    nums[i][j]= scan.nextInt();
                }

            }

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j==0) {
                    System.out.print(" "+(i+1)+ ". öğrencinin Vize Notu :" + nums[i][j]);
                }
                else {
                    System.out.print(" "+(i+1)+". öğrencinin Final Notu :"+nums[i][j]);
                }
            }
            System.out.println();
        }
    }
}

