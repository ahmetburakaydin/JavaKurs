package gun37tekrar.soru1;

public class Arac {
    /*
        private 3 degisken tanimlayin
            Marka, model, fiyat
        2 adet constructor yazin
        getter ve setter larini oluturun
        toString methodunu olusturun

        main methodu icinde bir nesne oluturun
        setterlari uygun sekilde düzenleyin
     */
    private String Marka;
    private int model;
    private int fiyat;

    public Arac(String marka, int model) {
        Marka = marka;
        this.model = model;
    }

    public Arac(String marka, int model, int fiyat) {
        Marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if(fiyat>0) this.fiyat = fiyat;

    }

    @Override
    public String toString() {
        return
                Marka +"("+ model + ")"+
                ", fiyat=" + fiyat;
    }
}
