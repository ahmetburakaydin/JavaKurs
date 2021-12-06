package HaftaSonu0412;

import javax.print.DocFlavor;

public class _017_Soru {
    public static void main(String[] args) {  // sağa dayalı 5br '*' üçgen

        for (int i=1; i<=5; i++) {
            System.out.print(" ");             // satır sayısı kadar satır  başınlarına boşluk
            for (int j=5; j>i; j--) {
                System.out.print(" ");         // satırın devamına yani sutunu yerleştireceğimiz * kadar
            }                                  // ters orantı olacak şekilde (j--tersden eksilerek) yine boşluk
            for (int j = 0; j<i; j++) {      //    ( 5den 1e )
                System.out.print("*");         // sutunun devamına (5den 1e) i tamamlayacak (1den 5e) *
            }                                  // görüşünüşte 5x5 * gibi gözüksede başlarında karakter olarak boşluk var
            System.out.println();              // mevcut kodda ilk  satırda boşluktan oluyor
                                               // başlardaki boşlukları dikkate almak gerekir.
        }


    }
}
