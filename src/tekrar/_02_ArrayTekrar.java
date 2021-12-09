package tekrar;

import java.util.Scanner;

public class _02_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 tane  isim girmesini isteyin.
        Bu isimlerden  uzunluğu 6 dan buyuk kaç eleman olduğunu bulun .
         */
        Scanner scan=new Scanner(System.in);
        String [] strArray= new String[5];
        int miktar = 0;

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Bir İsim Girin : ");
            strArray[i]=scan.nextLine();
        }
        for (int i = 0; i <5; i++) {
            if(strArray[i].length()>6){
                miktar++;
            }

        }
        System.out.println("Uzunluğu 6 dan buyuk Eleman Sayısı : "+miktar);
    }
}
