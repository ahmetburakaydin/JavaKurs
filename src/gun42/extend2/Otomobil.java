package gun42.extend2;

public class Otomobil extends Arac{
    String marka;


    public Otomobil(Tür tür, String model, String marka) {
        super(tür, model);
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "tür=" + tür +
                ", model='" + model +
                ", marka='" + marka
                ;
    }
}
