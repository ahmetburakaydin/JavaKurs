package gun37.packagefinal.pack1;

public class Arac {
    int a;
    static int b;
    final int c=1;
    // final son nihai demek, yani bu değişken aynı isimle bir daha tanımlanamaz
    // finallar ya ilk tanımlamada ya constructorda yada initializerda tanımlanmalıdır.
    // final olsada değişkenin metotları varsa kullanılabilir.
    // final değişken ,nesne create edildiğinde

     public void method(){
        // c=2; bu satır hata verir.cünkü  c final olduğu için  değer atanmaz.
        // değişkenlern yerinde constructor yada initalizerda tanımlanmaz ise final değişkenini başka yerde atayamayız.
    }
    // final methodlar override edilemezler
}
