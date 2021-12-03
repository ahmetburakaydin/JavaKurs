package gun14;

import java.util.Scanner;

public class _01_DoWhileOrnek {
    // kullanıcıdan tam sayı girmesini isteyin.Bu sayıların  karekökünü ekrana yazdırın.
    // kullanıcı sıfır girene kadar bu işlemi tekrarlayın.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num ;

        do {
            System.out.println("bir sayı girin : ");

            num =scan.nextInt();

            int karaKök = (int) Math.sqrt(num);

            System.out.println("karakökü "+karaKök);
        }
        while (num!=0);


    }
}
