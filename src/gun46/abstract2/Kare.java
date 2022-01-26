package gun46.abstract2;

public class Kare extends Dikdörtgen {

    public Kare(double uzunluk) {
        super(uzunluk, uzunluk);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunluk=" + uzunluk +
                ",alanı = "+alanHesapla()+
                ",cevresi = "+cevreHesapla()+
                '}';
    }
}
