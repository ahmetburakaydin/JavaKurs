package gun34.soru2;

import java.util.ArrayList;
import java.util.HashSet;

public class Isyeri {
    String adi;
    HashSet<Isci> calisanlar = new HashSet<>();

    public Isyeri(String adi) {
        this.adi = adi;
    }

    public void ekipCagır(Isci...isciler){
        for (Isci isci : isciler) {
            calisanlar.add(isci);
            calisanlar.add(isci.grupArkadasi);
        }

    }
    /*public void listele() {
        System.out.print(adi+" işyeri işçileri : ");
        for (Isci i:calisanlar) {
            System.out.print(i+", ");

        }
        System.out.println();
    }*/

    @Override
    public String toString() {
        return adi+ " Çalışanları : "+calisanlar ;
    }
}
