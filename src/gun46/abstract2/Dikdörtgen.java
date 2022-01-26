package gun46.abstract2;

public class Dikdörtgen extends Sekil{

    double uzunluk,genislik;

    public Dikdörtgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    double alanHesapla() {
        return uzunluk*genislik;
    }

    @Override
    double cevreHesapla() {
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
