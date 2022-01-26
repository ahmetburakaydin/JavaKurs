package gun47.ornek1;

public class GreekSalad extends Salad{
    public GreekSalad(String isim) {
        super(isim);
    }

    @Override
    public void madeIn() {
        System.out.println("Made in Greek");
    }
}
