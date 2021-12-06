package HaftaSonu0412;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın
        //.Daha sonra bu sayının çarpım tablosunu yazdırmalıdır.

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir tam sayı girin");
        int num =scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sonuc = num*i;
            System.out.println(num+"*"+i+"="+(sonuc));

        }


    }
}
