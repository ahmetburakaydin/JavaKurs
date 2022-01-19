package gun38.enum4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gunler.valueOf(sc.nextLine().toUpperCase()).ordinal()+1);


    }
}
enum gunler{
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESİ,PAZAR
}
