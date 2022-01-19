package gun37.package1.pack2;

import gun37.package1.pack1.Banka;

public class Main2 {
    public static void main(String[] args) {
        Banka b1 = new Banka();

        /*b1.sube="a"; */// farklı package da kullandığımız için görmüyor.
        b1.şehir="aa"; // public olduğu için aynı projede her yerden ulaşabilir.z

        /*Banka.count=1; */ // farklı package da kullanıyorz
        Banka.ulke="Türkiye"; // public aynı proje içinde her projeden ulaşabiliriz.
    }
}
