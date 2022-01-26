package gun46.interface2;

public class Kare1 implements Isekil{
    double uzunluk;

    public Kare1(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public double alanHesapla() {
        return uzunluk*uzunluk;
    }

    @Override
    public double cevreHesapla() {
        return 4*uzunluk;
    }

    @Override
    public String toString() {
        return "Kare1{" +
                "uzunluk=" + uzunluk +
                ",alanı = "+alanHesapla()+
                ",cevresi = "+cevreHesapla()+
                '}';
    }
}
