package gun8;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Çemberin Yarıçapını yazın : ");

        double yarıCap = scanner.nextDouble();
        double pi = 3.14;
        double cemberCevre = 2*pi*yarıCap;
        System.out.println("Çemberin Cevresi :"+ cemberCevre);

        double kareKenar = cemberCevre;
        double kareAlan = (int) (kareKenar*kareKenar);

        System.out.println("Karenin Alanı : "+kareAlan);

    }

}
