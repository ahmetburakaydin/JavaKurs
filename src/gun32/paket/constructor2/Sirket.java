package gun32.paket.constructor2;

public class Sirket {
    String name;
    String ünvan;
    String adres;
    int vergiNo;

    public Sirket(String name, String ünvan, String adres, int vergiNo) {
        this.name = name;
        this.ünvan = ünvan;
        this.adres = adres;
        this.vergiNo = vergiNo;
    }



        public Sirket(String name, String ünvan, String adres) {
            /*this.name = name;
            this.ünvan = ünvan;
            this.adres = adres;*/

        this(name,ünvan,adres,100);
    }

    public Sirket(String name, String ünvan) {
        /*this.name = name;
        this.ünvan = ünvan;*/
        this(name,ünvan,"adres bulunamadı",100);

    }

    @Override
    public String  toString() {
        return "Sirket{" +
                "name='" + name + '\'' +
                ", ünvan='" + ünvan + '\'' +
                ", adres='" + adres + '\'' +
                ", vergiNo=" + vergiNo +
                '}';
    }
}
