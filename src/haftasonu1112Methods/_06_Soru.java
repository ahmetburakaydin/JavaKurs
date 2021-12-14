package haftasonu1112Methods;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Kullanıcı tarafından girilen yarıçaplı bir dairenin çevresini ve alanını kendi yönteminizi tanımlayarak yazdıran
        //bir method yazın
        Scanner scan= new Scanner(System.in);
        System.out.println("Yaricap Girin");
        int yariCap=scan.nextInt();
        alanDaire(yariCap);
        cevreDaire(yariCap);
    }
    public static void cevreDaire ( int a) {
        int cevre ;
        int pi =3;
        int yaricap=a;
        cevre = 2*pi*yaricap;

        System.out.println("Dairenin Çevresi :"+ cevre);
    }
    public static void alanDaire(int a){
        int alan;
        int pi =3;
        int yaricap=a;
        alan=pi*yaricap*yaricap;

        System.out.println("Dairenin Alanı :"+ alan);
    }
}
