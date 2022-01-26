package gun43.ornek2;

public class Sekil {
    double cevre;
    double alan;

    public double cevreHesapla(){
        throw new RuntimeException("Belirsiz Şeklin Çevresi Hesaplanamaz");
    }
    public double alanHesapla(){

        throw new RuntimeException("Belirsiz Şeklin Alanı Hesaplanamaz");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "cevre=" + cevre +
                ", alan=" + alan +
                '}';
    }
}

