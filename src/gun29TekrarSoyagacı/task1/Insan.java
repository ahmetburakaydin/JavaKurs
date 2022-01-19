package gun29TekrarSoyagacı.task1;

import java.util.ArrayList;

public class Insan {
    String adi;
    int yasi;
    Insan anne;
    Insan baba;
    Insan es ;
    ArrayList<Insan> cocuklari = new ArrayList<>();


    public void veriAta(String adı, int yası){
        this.adi =adı;
        this.yasi =yası;
    }
    public void babaAta(Insan insan){ baba=insan;}
    public void anneAta(Insan insan){ anne=insan;}
    public void esAta(Insan insan) { es=insan; }

    public void cocukAta (Insan...adı) {
        for (Insan c:adı) {
            cocuklari.add(c);
        }
    }
    public void senKimsin () {
        System.out.println("Adım "+ adi +" Yaşım "+ yasi);
    }
    public void babaAdınNe () {
        System.out.println("Babamın  adı "+baba.adi +" ve " +baba.yasi +"yaşında");
    }
    public void anneAdınNe () {
        System.out.println("Annemin  adı "+anne.adi +" ve " +anne.yasi +"yaşında");
    }
    public void cocuklarınıSoyle () {
        for (int i = 0; i < cocuklari.size(); i++) {
            System.out.println("Çocuğum "+cocuklari.get(i).adi+" ");
        }
    }


}

