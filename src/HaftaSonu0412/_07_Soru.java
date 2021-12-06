package HaftaSonu0412;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //0 (sıfır) girilene kadar okutulacak tamsayılardan tek ve çift olanların sayısı ile teklerin ve
        //çiftlerin ayrı ayrı toplamlarını yazan programı yazın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Tamsayı Girin :");
        int num = scan.nextInt();
        int tekToplam = 0;
        int ciftToplam =0;

        for (int i = num; i>=0 ; i--) {
            if (i%2==1){
                tekToplam+=i;
            }else{
                ciftToplam+=i;
            }
        }
        System.out.println("Tek Sayıların Toplamı : "+tekToplam);
        System.out.println("Cift Sayıların Toplamı : "+ ciftToplam);

    }
}
