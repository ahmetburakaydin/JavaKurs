package gun48.ornek2;

public class Insan {

    String isim;
    boolean ehliyet=false;
    IsMakinasi arac;

    public Insan(String isim, boolean ehliyet) {
        this.isim = isim;
        this.ehliyet = ehliyet;
    }

    public void aracaBin(IsMakinasi arac){
        if(!(arac.sofor==null )){
            System.out.println("Ismakinesinde Sofor Var ,Binemem !");
        }else{
            System.out.println("Tamam Biniyorum");
            this.arac=arac;
            arac.sofor=this;

        }
    }
    public void aractanIn(){
        if(this.arac.calisiyor){
            System.out.println("Arac Calisiyor , Inemem !");
        }else{
            System.out.println("Aractan Iniyorum");
            arac.calisiyor=false;
            this.arac=null;

        }
    }
    public void sur(){
        if(!this.ehliyet){
            System.out.println("Ehliyetim Yokki , Suremem !");
        }
        else{
            System.out.println("Tamam Suruyorum.");
            this.ehliyet=true;
        }
    }
    public void dur(){
        System.out.println("Tamam Duruyorum.");

    }
    public void neYapıyorsun(){
        if(this.arac.calisiyor){
            System.out.println("Aractayim , Calisyorum");
        }
        else{
            if(this.arac==null){
                System.out.println("Aracım yok ,Beklemedeyim ");
            }
            else{
                System.out.println("Aractayım Bekliyorum.");
            }
        }


    }

    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", ehliyet=" + ehliyet +
                ", arac=" + arac +
                '}';
    }
}
