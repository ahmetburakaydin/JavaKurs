package gun34tekrar.soru2;

public class Isci {
    String adi;
    Isci grupArkadasi;

    public Isci(String adi) {
        this.adi = adi;
    }

    public void setGrup (Isci i1){
        this.grupArkadasi=i1;
        i1.grupArkadasi=this;
    }

    @Override
    public String toString() {
        return /*"Isci{" +
                "adi='" +*/ adi /*+ '\'' +
                ", grupArkadasi=" + grupArkadasi.adi +
                '}'*/;
    }
}
