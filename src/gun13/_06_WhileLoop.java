package gun13;

import java.util.Locale;
import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        /*
        Kullanicidan 5 tane kelime girmesini isteyin.
        Bu kelimeler  icerisinde a olan kac tane kelime oldugunu yazdirin.
         */

        int i = 0;
        int count = 0;

        while (i<5) {
            System.out.println("Bir Kelime Yazın"); // 5 tane kelime istenir.
            String kelime = scan.nextLine();

            if (kelime.toLowerCase(Locale.ROOT).contains("a")){
                count++; // içinde a geçen kelime sayısı ( içinde a bulunduğu takdir artar) en sonda yazdırılacak ifade
            }
            i++; // döngü için değişken girilen 5 kelimeyi sırayla istemek için gerekli sayac
        }
        System.out.println(" İçerisinde a gecen kelimeler "+count);






    }
}
