package gun12;

public class _021_WhileLoop {
    public static void main(String[] args) {
        //3 kere ekrana Hello Word yazdırın.

        int count = 0;

        while (count<3){ // parantez içerisindeki şart sağladığı sürece çalışır.
            System.out.println("Hello World");
            count++; // => count = count +1 // 1 artırarak sürekli çalıştırır(parantez içini sağladığı sürece)
            /*
        count = 0
        0<3
         System.out.println("Hello World");
         count = 1

         1<3
          System.out.println("Hello World");
          count =2

          2<3
           System.out.println("Hello World");
           count = 3

           3<3 degil döngü bitti

         */
        }
    }

}
