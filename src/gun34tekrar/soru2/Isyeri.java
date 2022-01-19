package gun34tekrar.soru2;

import java.util.HashSet;

public class Isyeri {
    String adi;
    HashSet<Grup> calisanlar=new HashSet<>();

    public Isyeri(String adi) {
        this.adi = adi;
    }


    @Override
    public String toString() {
        return adi+
                " calisanlar = " + calisanlar
                ;
    }

    /*public void isciAta(Isci...isciler){
        for (Isci isci:isciler) {
            calisanlar.add(isci);
            calisanlar.add(isci.grupArkadasi);
        }

    }*/
    public void grupAta(Grup...gruplar){
        for (Grup grup:gruplar) {
            calisanlar.add(grup);
        }
    }

}
