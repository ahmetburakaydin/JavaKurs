package gun37tekrar.soru2;

public class Arac {
    /*
    private 4 degisken tanimlayin
    Marka (enum), model, tip (enum), fiyat

        2-3 adet constructor yazin
    getter ve setter larini oluturun
    toString methodunu olusturun

    main methodu icinde bir nesne oluturun
    setterlari uygun sekilde düzenleyin
     */
    private Marka marka;
    private Tip tip;
    private int model;
    private double fiyat;

    public Arac(Marka marka, Tip tip, int model) {
        this.marka = marka;
        this.tip = tip;
        this.model = model;
    }

    public Arac(Marka marka, Tip tip, int model, double fiyat) {
        this.marka = marka;
        this.tip = tip;
        this.model = model;
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

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if(fiyat>0)this.fiyat = fiyat;

    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka=" + marka +
                ", tip=" + tip +
                ", model=" + model +
                ", fiyat=" + fiyat +
                '}';
    }
}
