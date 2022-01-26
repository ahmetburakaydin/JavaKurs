package gun43.ornek2;

public class Cember extends Sekil {
    double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yaricap;
    }

    @Override
    public double alanHesapla() {
        throw new RuntimeException("Çemberin Alanı Hesaplanamaz");
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap +
                '}';
    }
}
