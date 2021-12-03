package gun11;

import java.util.Scanner;

public class _012_Ornek {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("en az 3 haneli bir Sayı girin : ");
        //Girilen bir sayının onlar basamağının tek mi çift mi olduğunu bulunuz.
        String sayi=scan.nextLine();
        char onlarBasamak=sayi.charAt(sayi.length()-2);
        String strOnlar=String.valueOf(onlarBasamak);
        int intOnlar=Integer.parseInt(strOnlar);

        if (intOnlar%2==0){
            System.out.println("sayının onlar basamağı çift");
        }
        else {
            System.out.println("sayinin onlar basamağı tek");
        }

    }
}
