package gun28.task2;
    // class isimleri genelde object nesne isimleridir
    // class isimleri büyük harfler başlar, camelStyle şeklinde yazılır

public class Ogrenci {
    String  name ;  // fields , attributes
    int number;     // instance variable , nesne değişkeni


    // static tanımlanmayan tüm method ve variable lar nesneye aittir.
    // methodlara =>behaviours ,davranışlar denir.
    // küçük harfle başlar , camelStyle, hareket içeren fiiller kullanır.
    public void konus(){
        System.out.println("konuşuyorum.");

    }
    public void adiniSöyle(){
        System.out.println("adim "+name+", numaram "+number);
    }
}
