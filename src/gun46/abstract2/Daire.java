package gun46.abstract2;

public class Daire extends Cember{

    public Daire(double yaricap) {
        super(yaricap);
    }

    @Override
    double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }
    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                ",alanı = "+alanHesapla()+
                ",cevresi = "+cevreHesapla()+
                '}';
    }
}
