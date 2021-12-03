package HaftaSonuTekrar;

import java.util.Scanner;

public class _01OrnekString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime girin :");

        String metin1=scan.nextLine();
        char ilkHarf=metin1.charAt(0);
        System.out.println("ilk harf : " +ilkHarf);
        char ortaHarf=metin1.charAt(metin1.length()/2);
        System.out.println("ortadaki harf : "+ortaHarf);
        char sonHarf=metin1.charAt(metin1.length()-1);
        System.out.println("sondaki harf : " + sonHarf);

    }
}
