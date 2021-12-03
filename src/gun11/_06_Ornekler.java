package gun11;

import java.util.Scanner;

public class _06_Ornekler {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Kelimeler arasındaki bosluk en az 2 tane birim olacak şekilde cümle girin");

        String cumle2=scan.nextLine();
        // boslukları düzelterek çıkartmak için

        String dogruCumle =cumle2.replaceAll("[ ]+"," ");
        System.out.println("Cümlenin düzeltilmiş hali : "+" "+dogruCumle);
    }
}
