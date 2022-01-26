package gun47.ornek1;

public abstract class  Food {
    private String isim;

    public Food(String isim) {
        this.isim = isim;
        System.out.println("food constructor");
    }

    public abstract void madeIn();
    public abstract void taste();

    public String getIsim() {
        return isim;
    }

}
