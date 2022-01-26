package gun43.ornek1;

public class Calisan {
    String ismi;
    double maas;
    double maasKatsayisi;

    public double maasHesapla(){

        return maas= maas*maasKatsayisi;
    }

    public Calisan(String ismi, double maas, double maasKatsayisi) {
        this.ismi = ismi;
        try{
            if(maas>1000){
                this.maas=maas;
            }else{
                throw new RuntimeException("maaş 1000den küçük olamaz");
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        this.maasKatsayisi = maasKatsayisi;
    }

    public void setMaas(double maas) {
        if(maas>0){
            this.maas=maas;
        }

    }

    @Override
    public String toString() {
        return "ismi=" + ismi +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi
                ;
    }
}

