package gun37.ornek2;

public class Arac {
    private Marka marka;
    private Tip tip;
    private int modelYılı;
    private int fiyat;

    public Arac(Marka marka, Tip tip, int modelYılı) {
        this.marka = marka;
        this.tip = tip;
        this.modelYılı = modelYılı;
    }

    public Arac(Marka marka, Tip tip, int modelYılı, int fiyat) {
        this(marka,tip,modelYılı);
        this.fiyat = fiyat;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public int getModelYılı() {
        return modelYılı;
    }

    public void setModelYılı(int modelYılı) {
        if(modelYılı>2000)  this.modelYılı = modelYılı;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if(this.fiyat==0 && fiyat>0) {
            this.fiyat = fiyat;
        }
    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka=" + marka +
                ", tip=" + tip +
                ", modelYılı=" + modelYılı +
                ", fiyat=" + fiyat +
                '}';
    }
}
