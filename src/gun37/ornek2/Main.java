package gun37.ornek2;

public class Main {
    public static void main(String[] args) {
        Arac a1 = new Arac(Marka.FIAT,Tip.HATCHBACK,2011);
        a1.setFiyat(10000);
        a1.setModelYılı(2013);
        System.out.println(a1);
    }
}
