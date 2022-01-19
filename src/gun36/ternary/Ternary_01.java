package gun36.ternary;

import java.util.Scanner;

public class Ternary_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt() ;
        String sonuc = (num % 2 == 0 ) ? "Çift" : "Tek";  // if condition kalıbıyla aynı
                                                          // ternary operation bu şekilde kullanılıyor.
        System.out.println(sonuc);
    }
}
