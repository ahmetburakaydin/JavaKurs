package gun46.interface2;

public class Daire extends Cember {
    public Daire(double yaricap) {
        super(yaricap);
    }

    @Override

    public double alanHesapla() {

        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevreHesapla() {
      return super.cevreHesapla();
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
