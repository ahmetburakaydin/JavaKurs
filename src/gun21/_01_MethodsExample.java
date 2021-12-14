package gun21;

import java.util.Scanner;

public class _01_MethodsExample {
    public static void main(String[] args) {
        /*
         Okulda calisan bir ögretmen icin,
        ögrencilerin vize ve final notlarini girebilecegi
        ve kac ögrenci girmek istedigini alan
        bir metot ve sonuclari yazdiran ayri bir metot daha yazin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Öğrenci Sayısını Girin : ");
        int ogrenciSayısı = scan.nextInt();
        int [][] notlar = notGirisi(ogrenciSayısı);
        notYazdır(notlar);

    }
    public static int [][] notGirisi (int kacOgr ) {
        Scanner scan = new Scanner(System.in);
        int[][] notlar = new int[kacOgr][2];
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                if (j == 0) {
                    System.out.print((i+1)+".öğrenci "+"Vize : ");
                    notlar[i][j] = scan.nextInt();
                } else {
                    System.out.print((i+1)+".öğrenci "+"Final Notu : ");
                    notlar[i][j] = scan.nextInt();
                }
            }
        }
        return notlar;
    }
    public static void notYazdır (int [][] notlar) {
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
               if(j==0) {
                   System.out.print((i+1)+". öğrenci "+"Vize :"+notlar[i][j]+" ");
               }else {
                   System.out.print((i+1)+". öğrenci "+"Final : "+notlar[i][j]+" ");
               }

            }

        }
    }
}
