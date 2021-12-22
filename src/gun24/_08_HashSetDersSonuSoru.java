package gun24;

import java.util.HashSet;
import java.util.Scanner;

public class _08_HashSetDersSonuSoru {
    public static void main(String[] args) {
        /*

        Kullanicinin 1 ve ya 1 den fazla sayi girebilecegi ama tekrar eden sayilari
         kaydetmeyecek bir program yazin.
         */
        HashSet<Integer> sayilar =new HashSet<>();
        System.out.println(notGirisi(sayilar));
    }
    public static HashSet<Integer> notGirisi (HashSet<Integer> hashSet1){
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        String cevap;
        int num;
        do {
            System.out.print("bir sayı girin :");
            num = scanInt.nextInt();
            hashSet1.add(num);
            System.out.println();
            System.out.print("Başka bir not girmek istiyormusunuz 'evet' yada 'hayır' girin ");
            cevap = scanStr.next();
        }
        while (cevap.equalsIgnoreCase("evet"));
        return hashSet1;
    }
}
