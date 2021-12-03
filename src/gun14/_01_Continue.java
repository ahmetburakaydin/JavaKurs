package gun14;

import java.util.Scanner;

public class _01_Continue {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayi girmesini isteyin.cümledeki her harfi alt alt yazdırın.
        Boşluk gelirse boşluk yazdırmayın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String cumle=scan.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==' '){
                continue; // alt satıra indirmez
                            }
            System.out.println(cumle.charAt(i));
        }

    }
}
