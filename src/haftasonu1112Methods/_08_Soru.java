package haftasonu1112Methods;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu Girin (100 üzerinden)");
        int not = scan.nextInt();
        notHesaplama(not);
    }
    public static void notHesaplama (int a) {
        if ( a>=90) System.out.println("Kredi Notu AA ");
        else if ( a>=85) System.out.println("Kredi Notu BA ");
        else if ( a>=80) System.out.println("Kredi Notu BB ");
        else if ( a>=75) System.out.println("Kredi Notu CB ");
        else if ( a>=70) System.out.println("Kredi Notu CC ");
        else if ( a>=60) System.out.println("Kredi Notu DC ");
        else if ( a>=50) System.out.println("Kredi Notu DD ");
        else {
            System.out.println(" F - BAŞARISIZ DERS TEKRARI !");
        }
    }
}
