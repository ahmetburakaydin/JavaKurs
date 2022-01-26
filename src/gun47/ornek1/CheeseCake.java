package gun47.ornek1;

public class CheeseCake extends Sweet{

    public CheeseCake(String isim) {
        super(isim);
        System.out.println("CheeseCake constructor");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in USA");
    }
}
