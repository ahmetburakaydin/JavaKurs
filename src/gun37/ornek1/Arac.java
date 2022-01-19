package gun37.ornek1;

public class Arac {
    private String marka;
    private int modelYılı;
    private int fiyat;

    public static void main(String[] args) {
        Arac a1 = new Arac("Ford");
        Arac a2 = new Arac("Renault",2009,5000);
        System.out.println(a2);
        a1.setFiyat(10000);
        a1.setModelYılı(2011);
        System.out.println(a1);
    }

    public Arac(String marka) {
        this.marka = marka;
    }

    public Arac(String marka, int modelYılı) {
        this.marka = marka;
        this.modelYılı = modelYılı;

    }

    public Arac(String marka, int modelYılı, int fiyat) {

        this.marka=marka;
        if(modelYılı>2010)  this.modelYılı=modelYılı;
        if(fiyat>10000) this.fiyat = fiyat;

    }

    @Override
    public String toString() {
        return  marka+" "+ modelYılı +" "+ fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModelYılı() {
        return modelYılı;
    }

    public void setModelYılı(int modelYılı) {
        if(modelYılı>2000) this.modelYılı = modelYılı;

    }

    public int getFiyat() {

        return fiyat;
    }

    public void setFiyat(int fiyat) {
        if(fiyat>0)this.fiyat = fiyat;

    }
}
