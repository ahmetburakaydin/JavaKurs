package gun43.ornek1;

public class Mudur extends Calisan{
    double makamKatsayısı;

    @Override
    public double maasHesapla() {
        return super.maasHesapla()*makamKatsayısı;
    }

    public Mudur(String ismi, double maas, double maasKatsayisi, double makamKatsayısı) {
        super(ismi, maas, maasKatsayisi);
        this.makamKatsayısı = makamKatsayısı;
    }



    @Override
    public String toString() {
        return "ismi="+ismi +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                ", makamKatsayısı=" + makamKatsayısı ;
    }
}
