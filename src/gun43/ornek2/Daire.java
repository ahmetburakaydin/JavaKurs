package gun43.ornek2;

public class Daire extends Cember{

    public Daire(double yaricap) {
        super(yaricap);
    }

    @Override
    public double cevreHesapla() {
        return super.cevreHesapla();
    }

    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                '}';
    }
}
