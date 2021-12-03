package gun13;

import java.util.Scanner;

public class _08_DoWhileLoop {
    public static void main(String[] args) {
        /* Kullanıcıdan kelime girmesini isteyin.
            içinde x ifadesi geçtiği anda program sonlansın.
         */
        /*
        while döngüsünde önce şartı kontrol eder.eğer şart sağlanırsa döngü sona erer.
        do-while döngüsünde önce işlemi yapar  sonra while içindeki şartın sağlanıp sağlanmadığı kontrol eder.
         */
        Scanner scan =new Scanner(System.in );
        String kelime ;
        do {
            System.out.println("bir kelime girin");
            kelime= scan.nextLine();
        } while (!kelime.contains("x")); //kelime içerisinde x olmadığı sürece


    }
}
