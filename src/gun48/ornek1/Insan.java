package gun48.ornek1;

import java.util.ArrayList;
import java.util.Arrays;

public class Insan {
    /**
    -gerekebilecek  parametre ve fieldları ekleyin
     -Birine arkadaş atanınca ,atanan kişinin  de arkadaşı diğer kişi olacak.
     -5 insan oluşturup mainde arkadaş atayın ve bunları sohbet ettirin.
     alternatifleri deneyin
     -
     */


    String ismi;
    ArrayList<Insan> arkadaslar = new ArrayList<>();
    boolean sohbetEdiyorMu=false;

    public Insan(String ismi) {
        this.ismi = ismi;
    }

    public void arkadasAta(Insan insan){
        this.arkadaslar.add(insan);
        insan.arkadaslar.add(this);
    }

    public void arkadasAta(Insan...insan){

        this.arkadaslar.addAll(Arrays.asList(insan));
    }

    public void sohbetEt(Insan insan){
        if (sohbetEdiyorMu) {
            System.out.println("Başkasıyla Sohbet Ediyorum .Kusura Bakma !");
        }else{
            if(!this.arkadaslar.contains(insan))
                System.out.println("Seninle Arkadaş Değiliz !!!");
            else{
                System.out.println("Hadi Sohbet Edelim.");
                this.sohbetEdiyorMu=true;
            }
        }

    }

}



