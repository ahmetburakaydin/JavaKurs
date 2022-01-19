package gun34.soyayacıyeni;

import java.util.ArrayList;

public class Insan {
    String adi;
    int yasi;
    Insan anne;
    Insan baba;
    Insan  es;
    ArrayList <Insan> cocuklar = new ArrayList<>();

    public Insan(String adi, int yasi) {
        this.adi = adi;
        this.yasi = yasi;
    }

    public Insan(String adi, int yasi, Insan anne, Insan baba) {
        this.adi = adi;
        this.yasi = yasi;
        this.anne = anne;
        this.baba = baba;
        anne.cocukAta(this);
        baba.cocukAta(this);
    }

    public void esAta(Insan insan){
        this.es=insan;
        insan.es=this;
        insan.cocuklar=this.es.cocuklar;
    }
    public void anneAta (Insan insan) {
        this.anne=insan;
    }
    public void babaAta (Insan insan) {
        this.baba=insan;
    }

    public void cocukAta(Insan...cocuklar) {
        for (Insan cocuk : cocuklar) {
            this.cocuklar.add(cocuk);

        }
    }

    @Override
    public String toString() {
        return adi +
                " (" + yasi + ")";
    }
}
