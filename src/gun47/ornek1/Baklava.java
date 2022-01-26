package gun47.ornek1;

public class Baklava extends Sweet{

    public Baklava(String isim) {
        super(isim);
        System.out.println("baklava constructor");
    }

    @Override
    public void madeIn() {
        System.out.println("Made in Turkey");
    }
}
