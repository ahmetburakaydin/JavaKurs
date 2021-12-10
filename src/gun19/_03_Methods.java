package gun19;

import java.util.Scanner;

public class _03_Methods {
    public static void main(String[] args) {
        /*
        kullanıcının gireceği sayının tek mi çift mi olduğunu bulabilecek bir metot yazın.
         */
        Scanner scan=new Scanner(System.in);
        int sayi = scan.nextInt();
        tekMiCiftMi(sayi);
        tekMiCiftMi(21);

    }
    public static void tekMiCiftMi(int num) {
        if(num%2==1){
            System.out.println("Sayi tekdir.");
        }else {
            System.out.println("Sayı Çiftir.");
        }
    }
}
