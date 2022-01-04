package gun31.paket1;

public class Main1 {
    public static void main(String[] args) {
        Kitap kitap1=new Kitap();
        Kitap kitap2=new Kitap();
        Kitap kitap3=new Kitap();

        kitap1.kitaptanımla("Huzursuzluk",1999,1000);
        kitap1.getKitapBilgisi();
        kitap2.kitaptanımla("Olasılıksız",2005,750);
        kitap2.getKitapBilgisi();
        kitap3.kitaptanımla("Körlük",1987,500);
        kitap3.getKitapBilgisi();

        Kitap.kitapSayısıYaz();





        /*
        Bir Kitap Classının tanımlaın.
        Instance Variables ;
        name
        basım yılı
        sayfa sayısı
        ınstance methods
            kitaptanımla()  kitabın instance variableslarınını alalım
            getKitapBilgisi() ile kitapbilgisini yazdıralım
        Class Vars
            kitap sayısı
        Class methods
            kitapSayısıYaz()

            main1 de  3 tane kitap oluşturalım
            kitap bilgilerini yazdıralım
            kitapSayısınınYaz ile toplam kitap sayısının yazdıralım

         */

    }
}

class Kitap {
    String adi;
    int basımYılı;
    int sayfaSayısı;
    static int kitapSayısı;

    public void kitaptanımla(String adi,int basımYılı,int sayfaSayısı){
        this.adi=adi;
        this.basımYılı=basımYılı;
        this.sayfaSayısı=sayfaSayısı;
        kitapSayısı++;
    }
    public void getKitapBilgisi(){
        System.out.println(" Adı :"+adi+"\nBasım Yılı : "+basımYılı+" \nSayfa Sayısı : "+sayfaSayısı);
    }

    public static void kitapSayısıYaz(){
        System.out.println("Toplam Kitap Sayısı : "+kitapSayısı);
    }

}
