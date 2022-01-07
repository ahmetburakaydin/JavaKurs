package gun31Tekrar.paket1;

public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap();
        k1.kitapTanımla("Olasılıksız",1967,500);
        Kitap k2 = new Kitap();
        k2.kitapTanımla("Kişiliksiz",1999,427);
        Kitap k3 = new Kitap();
        k3.kitapTanımla("Karaktersiz",2021,129);

        k1.getKitapBilgisi();
        k2.getKitapBilgisi();
        k3.getKitapBilgisi();

        Kitap.kitapSayısıYaz();
    }
}
