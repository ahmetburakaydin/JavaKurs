package gun46.abstract2;

public class Main {
    public static void main(String[] args) {
    /*
    Sekil    abstract class
        alanHesapla
        cevreHesapla
        Dikdörtgen extend sekil
            Kare extend dikdörtgen
        Cember extend sekil
            Daire extend  cember
     */
        Sekil cember= new Cember(5);
        Sekil daire = new Daire(4);
        Sekil dikdörtgen = new Dikdörtgen(7,8);
        Sekil kare = new Kare(10);

        System.out.println(cember);
        System.out.println(daire);
        System.out.println(dikdörtgen);
        System.out.println(kare);
    }
}
