package gun46.interface2;

public class Cember implements Isekil {
    double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        throw new RuntimeException("Çemberin Alanı Olmaz") ;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yaricap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yaricap=" + yaricap +
                ",cevresi = "+cevreHesapla()+
                '}';
    }
}
