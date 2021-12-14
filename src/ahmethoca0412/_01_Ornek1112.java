package ahmethoca0412;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Ornek1112 {
    public static void main(String[] args) {
        /*
        kullanıcıdan aldığının 5 sayıyı bir arraye atıp ekrana oluşturulan arrayi yazdırın.
        bunlardan tek olanları 1 artırıp , çift olanları 0 olarak  ekrrana tüm arrayi yazdırın.
        */
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Bir Sayi Girin : ");
            intArray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                intArray[i] += 1;
            } else if (intArray[i] % 2 == 0) {
                intArray[i] = 0;
            }


        }System.out.println(Arrays.toString(intArray));

    }
}