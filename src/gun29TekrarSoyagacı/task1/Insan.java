package gun29TekrarSoyagacı.task1;

import java.util.ArrayList;

public class Insan {
    String adı;
    int yası;
    Insan anne;
    Insan baba;
    Insan es ;
    ArrayList<Insan> kardesleri = new ArrayList<>();
    ArrayList<Insan> cocukları =new ArrayList<>();

    public void veriAta(String adı, int yası){
        this.adı=adı;
        this.yası=yası;
    }
    public void babaAta(Insan insan){ baba=insan;}
    public void anneAta(Insan insan){ anne=insan;}
    public void esAta(Insan insan) { es=insan; }
    public void kardesAta(Insan...adı) {
        for (Insan k :adı) {
            kardesleri.add(k);
        }
    }
    public void cocukAta (Insan...adı) {
        for (Insan c:adı) {
            cocukları.add(c);
        }
    }
    public void senKimsin () {
        System.out.println("Adım "+ adı+" Yaşım "+yası);
    }
    public void babaAdınNe () {
        System.out.println("Babamın  adı "+baba.adı+" ve " +baba.yası+"yaşında");
    }
    public void anneAdınNe () {
        System.out.println("Annemin  adı "+anne.adı+" ve " +anne.yası+"yaşında");
    }
    public void cocuklarınıSoyle () {
        for (int i = 0; i < cocukları.size(); i++) {
            System.out.println("Çocuğum "+cocukları.get(i).adı+" ");
        }
    }
    public void kardesleriniSöyle () {
        for (int i = 0; i < kardesleri.size(); i++) {
            System.out.println("Kardeşim "+kardesleri.get(i).adı+" ");
        }
    }

}

