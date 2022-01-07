package gun32.paket.constructor3;

public class Sirket {
    String name;
    String unvan;
    String adres;
    int vergiNo;

    public Sirket(String name) {
        this.name = name;
    }

    public Sirket(String name, String unvan) {
        this(name);
        this.unvan = unvan;
    }

    public Sirket(String name, String unvan, String adres) {
        this(name,unvan);
        this.adres = adres;
    }

    public Sirket(String name, String unvan, String adres, int vergiNo) {
        this(name,unvan,adres);
        this.vergiNo = vergiNo;
    }

    @Override
    public String  toString() {
        return "Sirket{" +
                "name='" + name + '\'' +
                ", ünvan='" + unvan + '\'' +
                ", adres='" + adres + '\'' +
                ", vergiNo=" + vergiNo +
                '}';
    }
}
