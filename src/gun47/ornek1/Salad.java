package gun47.ornek1;

public abstract class Salad extends Food {

    public Salad(String isim) {
        super(isim);
    }



    @Override
    public void taste() {
        System.out.println("good");
    }
}
