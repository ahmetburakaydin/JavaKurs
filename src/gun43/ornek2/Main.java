package gun43.ornek2;

public class Main {
    public static void main(String[] args) {
        Sekil s1 = new Sekil();

        Cember cem = new Cember(5.2);
        Daire daire = new Daire(3.8);

        Dikdörtgen dik= new Dikdörtgen(5.1,3.8);
        Kare kare = new Kare (2.0);


        System.out.printf("Dairenin alanı %.2f birimdir",daire.alanHesapla());
        System.out.println(cem.cevreHesapla());
        System.out.println(daire.alanHesapla());
        System.out.println(daire.cevreHesapla());
        System.out.println(dik.cevreHesapla());
        System.out.println(dik.alanHesapla());
        System.out.println(kare.alanHesapla());
        System.out.println(kare.cevreHesapla());



    }
}
