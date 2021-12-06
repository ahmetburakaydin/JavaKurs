package HaftaSonu0412;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan bir tam sayı girmesini isteyen ve ardından sayıları ters çevrilmiş sayıyı veren
        //bir program yazın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tam sayı girin");
        int numInt = scan.nextInt();
        String num=String.valueOf(numInt);

        for (int i = num.length()-1; i >=0 ; i--) {
            System.out.print(num.charAt(i));

        }

    }
}
