package gun12;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i = 0; //sayac
        System.out.println("Bir sayı girin : "); // girilen 5 sayıdan en küçüğünü yazdırın.
        int enk = scan.nextInt(); // sayıların ilkini en küçük olarak ilk sayı olarak istenir.

        while (i<4){   // sayac sayısı 1 azaltılır ilki üste istendiği için.
            System.out.println("Bir sayi girin : "); // en küçük sayiyi yazdırın
            int num = scan.nextInt();

            if (num<enk){
                enk=num;
            }
            i++;
        }
        System.out.println("En küçük sayı : "+enk);
    }
}
