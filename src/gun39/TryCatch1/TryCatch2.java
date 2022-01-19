package gun39.TryCatch1;

public class TryCatch2 {
    public static void main(String[] args) {
        int a = 4 ;
        int b = 0 ;

        // yapacağım işlem esnasında hatayı öngörüyorsanız , yapılan ,işlem try catch içine alınır
       try {
           System.out.println(a/b);
           // burada hata çıkarsa otomatik olarak catch bölümüne atlanır.
       }catch (Exception e) {
            /*e.printStackTrace();*/  // hatayı yazdırıp programı sonlandırır.
           System.out.println("İlk TryCatch");
       }
        try {
            System.out.println(a/b);
            // burada hata çıkarsa otomatik olarak catch bölümüne atlanır.
        }catch (ArithmeticException e) {
            e.printStackTrace();  // hatayı yazdırıp programı sonlandırır.

        }
        System.out.println("ikinci trycatch");

    }
}
