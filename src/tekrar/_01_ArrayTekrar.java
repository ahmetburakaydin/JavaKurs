package tekrar;

import java.util.Scanner;

public class _01_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayi alarak bu sayi uzunluğunda int bir array oluşturun.
        Dizinin elemanlarını kullanıcının gireceği sayılarla doldurun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir int Dizi Uzunluğu Belirleyin.");
        int num= scan.nextInt(); // dizi uzunluğunu kulllacınıdan iste.

        int[]nums=new int[num]; // alınan değer kadar bir elemanı olan bir dizi tanımla.

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Bir Sayi Girin :");  // dizi uzunluğu kadar dizi elemanı girmesini iste.
            nums[i]=scan.nextInt();                // alınanan değerleri diziye ata

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");  // atananan değerlere göre dizinin son halini yazdır.
        }


    }
}

