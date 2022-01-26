package gun46.interface2;

public class Main {
    /*
    ISekil    interface
        alanHesapla
        cevreHesapla
        Dikdörtgen
            Kare
        Cember
            Daire
     */
    public static void main(String[] args) {
        Isekil dikdörtgen = new Dikdörtgen(3,4);
        Isekil kare = new Kare(5);
        Isekil kare1 = new Kare1(4);
        Isekil cember = new Cember(3.6);
        Isekil daire = new Daire(5.1);

        System.out.println(dikdörtgen);
        System.out.println(kare);
        System.out.println(kare1);
        System.out.println(cember);
        System.out.println(daire);
    }
}
