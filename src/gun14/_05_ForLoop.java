package gun14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("a ve c de içeren  Kelime Girin"); // a harflerinin sayısı bulun c harfini bulunca sonlandırın.
        String kelime= scan.nextLine();

        int aSayısı=0;


        for (int i = 0; i<kelime.length(); i++) {
            if (kelime.toLowerCase().charAt(i)=='a'){
                aSayısı++;
            }
            else if (kelime.toLowerCase().charAt(i)=='c') {
                break;
            }

        }
        System.out.println("Toplam A Sayısı : "+ aSayısı);







    }
}
