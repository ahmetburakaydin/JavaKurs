package gun48.ornek2;

public class IsMakinasi {
    String isim;
    Insan sofor;
    boolean calisiyor;

    public String soforu(){
        String sonuc = (this.sofor.ehliyet) ? "Ehliyeti Var" : "Ehliyeti Yok";
        return this.sofor.isim+","+sonuc;
    }
    public IsMakinasi(String isim) {
        this.isim = isim;


    }

    @Override
    public String toString() {
        return "IsMakinasi{" +
                "isim='" + isim + '\'' +
                /*", sofor=" + sofor +*/
//                ", calisiyor=" + calisiyor +
                '}';
    }
}
