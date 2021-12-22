package gun28.task3;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac();
        Arac a2 = new Arac();
        a1.marka = "Audi";
        a1.modelYılı = 2016;
        Arac.sayi++;
        a1.sayi1++;

        a2.marka = "BMW";
        a2.modelYılı = 2021;
        Arac.sayi++;
        a2.sayi1++;

        System.out.println("Üretilen Araç Sayısı : "+ Arac.sayi);
        System.out.println(a1.marka+" , "+a1.sayi1);
        System.out.println(a2.marka+" , "+a2.sayi1);
        a1.calıs();
        a1.kornaBas(a2.marka);
        a1.stopEt();
        a2.calıs();
        a2.kornaBas(a1.marka);
        a2.stopEt();
        yaz(a1);        // Main Clası altında tanımlanan yaz methodu
        yaz(a2);        // Aynı Class  içinde kullanılacaksa Class ismi yazmaya gerek yok
        Main.yaz(a1);  //  Başaka classlarda bu şekilde kullanılır
        Main.yaz(a2);  // Class ismiyle birlikte method kullanılır.

        // Main Clasında static olmayan bir method tanımlandığında ( yaz1() gibi )

        Main m = new Main();  // Kullanılabilmesi için  oluşturulduğun classda yeni bir nesne oluşturulup ( m )
        m.yaz1(a2);      // bu nesne üzerinde bu method kullanılır
        m.yaz1(a1);         // parametre vs uygun şekilde yazılır
    }
    // static method class a (burda maine aittir.)Ulaşım yetkisyile clas ismine göre herkes ulaşbilir.
    public static void yaz(Arac arac){
        System.out.println(arac.marka+" - "+ arac.modelYılı+" geldi");
    }
    public void yaz1 (Arac arac) {
        System.out.println(arac.marka+" - "+arac.modelYılı+" geldi");
    }


}

class Arac {
    // instance variables
    String marka;
    int modelYılı;
    static int sayi;
    int sayi1;


    //behaivors
    public void calıs() {
        System.out.println(marka + " " + modelYılı + " çalıştım");
    }

    public  void kornaBas (String isim) {
        System.out.println("Selam "+isim +", ben "+ marka + " " + modelYılı + " korna bastım");
    }

    public void stopEt() {
        System.out.println(marka + " " + modelYılı + " stop etti.");
    }
}
