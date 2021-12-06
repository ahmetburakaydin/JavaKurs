package HaftaSonu0412;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan bir metin girmesini isteyen ve bu metni tersten yazdıran programı yazınız.
        //Input : Java ise Output: avaJ

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String str = scan.nextLine();

        for (int i =str.length()-1; i>=0; i--) {  // sayac olarak index  yerleri kullanılır
            System.out.print(str.charAt(i));         // döngüyü charat(str.length-1)den 0 a kadar sırayla yazdırıyor

        }
    }
}
