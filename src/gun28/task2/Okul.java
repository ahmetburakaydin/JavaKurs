package gun28.task2;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();

        ogr1.name="ahmet";   // Ogrenci classının static olmayan tüm değişken ve metotlarını kullanabiliriz.
        ogr1.number=123;

        ogr1.konus();
        ogr1.adiniSöyle();

        Ogrenci ogr2 = new Ogrenci();
        ogr2.name="asya";
        ogr2.number=456;

        ogr2.konus();
        ogr2.adiniSöyle();
    }
}
