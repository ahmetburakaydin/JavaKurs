package gun47.ornek1;

public abstract class Sweet extends Food{

    public Sweet(String isim) {
        super(isim);
        System.out.println("Sweet constructor");
    }



    @Override
    public void taste() {
        System.out.println("Sweet");
    }
}
