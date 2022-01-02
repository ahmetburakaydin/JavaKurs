package gun29.task1;

public class Main {

    public static void main(String[] args) {
        Kitap kitap1 = new Kitap();
        Kitap kitap2 = new Kitap();

        kitap1.kitapAdı = "Tutunamayanlar";
        kitap1.basımYılı = 1972;
        kitap1.sayfaSayısı = 900;

        kitap2.kitapAdı = "Sefiller";
        kitap2.basımYılı = 1862;
        kitap2.sayfaSayısı = 1721;

        kitap1.bilgileriniYaz();
        kitap2.bilgileriniYaz();
        kitapAdı(kitap1);
        kitapAdı(kitap2);

    }

    public static void kitapAdı(Kitap kitap1) {
        System.out.println(kitap1.kitapAdı);
    }
}
