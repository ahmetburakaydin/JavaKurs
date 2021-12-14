package HaftaSonu1112Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _011_Soru<array> {
    public static void main(String[] args) {
        //Bir dizinin her elemanını dairesel olarak sağa kaydıran bir program yazın. Örneğin.-
        //GİRİŞ : 1 2 3 4 5
        //ÇIKTI : 5 1 2 3 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaydırma Miktarı");
        int [] array = {1,2,3,4,5};
        int [] revArray =new int[array.length];

            revArray[0]=array[array.length-1];
        for (int i = 1 ; i< array.length; i++) {
            revArray[i]=array[i-1];


        }
        System.out.println(Arrays.toString(revArray));

    }
}
