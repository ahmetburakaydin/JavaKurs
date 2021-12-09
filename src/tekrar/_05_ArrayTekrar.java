package tekrar;

import java.util.Scanner;

public class _05_ArrayTekrar {
    public static void main(String[] args) {
        // Kullanıcıdan 5 tane email alın.Bu emaillerde @ işareti olmayanların miktarını bulun.
        Scanner scan=new Scanner(System.in);
        String [] strArray=new String[5];
        int miktar = 0;

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Bir Email giriniz");
            strArray[i]= scan.nextLine();

        }
        for (int i = 0; i < strArray.length; i++) {
            if(!strArray[i].contains("@")){
                miktar++;
            }
        }
        System.out.println("@ işareti olmayan mail sayisi : "+miktar);
    }
}
