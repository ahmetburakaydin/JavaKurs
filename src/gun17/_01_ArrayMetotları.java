package gun17;

import java.util.Scanner;

public class _01_ArrayMetotları {
    public static void main(String[] args) {
         /*
        Kullanicidan bir cümle yazmasini isteyin.
        Bu cümledeki harfleri kelime kelime bir diziye atin.
        Cümleyi tersten yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Cümle Girin");
        String cumle = scan.nextLine();
        String [] kelimeler =  cumle.split(" ");

        for (int i = kelimeler.length-1; i>=0 ; i--) {
            System.out.print(kelimeler[i]+" ");
        }



    }
}
