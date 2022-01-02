package gun29.task1;

public class Kitap {
    String kitapAdı;
    int sayfaSayısı;
    int basımYılı;
    int a; // 1.tanımlanan a

    public void bilgileriniYaz() {
        int a=2; // 2.tanımlanan a
        this.a=3; // this diyince  classın içinde tanımlananı seçer
                  // yazmassak localden classa doğru kontrol eder ve en yakın olanı seçer.
                  // this yazmasak buradaki stringi tanımlamamızı ister.
                    // classdaki değişkenleri null ve ya 0 şeklinde otomaik tanımladığı için ekstra initalize etmeye gerek yok
                    // ancak method içinde değişkeni tanımlayı sonrasında kullanacaksanız değer atamanızı ister.
        String kitapAdı ;
        System.out.println("kitabın adı " + this.kitapAdı + " , " + sayfaSayısı + " sayfa " + basımYılı);

                    // class ın içnde behaviourslarda ( static olmayanlar , class ait olan methodlarda )
                    // classa a instance variablesları kullanılabilir.
    }

}




