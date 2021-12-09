package gun18;

import java.util.Scanner;

public class _04_Array2D {
    public static void main(String[] args) {
        // öğrencilerin vize ve final notlarını girebileceği bir program yazın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Ogrenci Sayısı");
        int ogrenciSayısı = scan.nextInt();


        int[][] nums =new int[ogrenciSayısı][2];

        for (int i = 0; i < nums.length; i++) {  // for for döngüsünü notları kullacıdan almak için kullanıyoruz
            for (int j = 0; j < nums[i].length; j++) {
                if(j==0) { //  j= 0 j=1 2 sütun alternatifi var 0ları bir sutune 1 leri 1 sutuna ayırmak için if kullanılır
                    System.out.println((i+1)+". ogrencinin Vize Notu Girin ");
                    nums[i][j]=scan.nextInt();
                }else {
                    System.out.println((i+1)+". ogrencinin Final Notu Girin ");
                    nums[i][j]=scan.nextInt();
                }
            }
            System.out.println();

        }
        for (int i = 0; i < nums.length; i++) {  // for for döngüsü  notları yazmak için
            for (int j = 0; j < nums[i].length; j++) {
                if(j==0) { //
                    System.out.print(" "+(i+1)+". ogrenci "+"Vize Notu "+nums[i][j]);

                }else {
                    System.out.print(" "+(i+1)+" .ogrenci "+"Final Notu "+nums[i][j]);

                }
            }
            System.out.println();

        }

    }
}
