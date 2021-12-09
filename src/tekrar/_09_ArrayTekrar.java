package tekrar;

import java.util.Scanner;

public class _09_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle yazmasini isteyin.
        Bu cümledeki harfleri kelime kelime bir diziye atin.
        Cümleyi tersten yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle Yazın");
        String cumle=scan.nextLine();
        String [] strArray=cumle.split(" ");
        for (int i = strArray.length-1 ; i>=0 ; i--) {
            System.out.print(strArray[i]+" ");

        }
    }

}
