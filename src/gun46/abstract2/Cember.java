package gun46.abstract2;

public class Cember extends Sekil{
    double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double alanHesapla() {
        throw new RuntimeException("Cemberin alanı Hesaplanamaz");
    }

    @Override
    double cevreHesapla() {
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
