package gun46.interface2;

public class Dikdörtgen implements Isekil{
    double uzunluk;
    double genislik;

    public Dikdörtgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {

        return uzunluk*genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunluk+genislik);
    }

    @Override
    public String toString() {
        return "Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                ",alanı = "+alanHesapla()+
                ",cevresi = "+cevreHesapla()+
                '}';
    }
}
