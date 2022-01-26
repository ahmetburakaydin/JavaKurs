package gun47.ornek1;

public class SezarSalad extends Salad{
    public SezarSalad(String isim) {
        super(isim);
    }

    @Override
    public void madeIn() {
        System.out.println("Made in Mediterrian");
    }
}
