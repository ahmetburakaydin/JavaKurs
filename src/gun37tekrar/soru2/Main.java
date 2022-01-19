package gun37tekrar.soru2;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac(Marka.HONDA,Tip.SPOR,2015);

        Arac a2 = new Arac(Marka.FORD,Tip.SUV,2011);
        a1.setFiyat(20000);
        a2.setFiyat(15000.05);

        System.out.println(a1);
        System.out.println(a2);
    }
}
