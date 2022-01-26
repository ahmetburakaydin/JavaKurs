package gun43.ornek2;

public class Dikdörtgen extends Sekil {
    double uzunluk;
    double genislik;

    public Dikdörtgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2*(uzunluk+genislik);
    }

    @Override
    public double alanHesapla() {
        return uzunluk*genislik;
    }


    @Override
    public String toString() {
        return "Dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}
