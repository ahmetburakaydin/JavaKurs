package gun34.soru;

public class Ayakkabı {
    Mevsim mevsim;
    Marka marka;
    int numara;

    public Ayakkabı(Mevsim mevsim, Marka marka, int numara) {
        this.mevsim = mevsim;
        this.marka = marka;
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ayakkabı{" +
                "mevsim=" + mevsim +
                ", marka=" + marka +
                ", numara=" + numara +
                '}';
    }
}
