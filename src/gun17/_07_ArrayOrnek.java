package gun17;

import java.util.Scanner;

public class _07_ArrayOrnek {
    public static void main(String[] args) {
        // Kullanıcıdan 5 tane email alın.Bu emaillerde @ işareti olmayanların miktarını bulun.
        Scanner scan=new Scanner(System.in);
        String [] array = new String[5];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Mail adresinizi girin");
            array[i]=scan.nextLine();
        }
        int miktar =0;
        /*
        for (int i = 0; i <5 ; i++) {

            if(!array[i].contains("@")){
                miktar++;
            }
        }*/
        for (String email: array){ // foreach metodu
            if(!email.contains("@")) {
                miktar++;
            }
        }

        System.out.println("@ işareti Olmayan mail sayısı : "+miktar);
    }
}
