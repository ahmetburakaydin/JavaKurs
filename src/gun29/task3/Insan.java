package gun29.task3;

import java.util.ArrayList;

public class Insan {
    String adı;
    int yas;
    Insan baba;
    Insan anne;
    Insan es;     // sonrasında ödev olarak aile soy ağacından kullanılmak üzere kullanılacak .
    ArrayList<Insan> cocukları =new ArrayList<>();


    public void veriAta(String adı,int yas) {
        this.adı=adı;
        this.yas=yas;
    }
    public void babaAta(Insan insan) {
        baba= insan;
    }
    public void anneAta(Insan insan) {
        anne = insan;
    }
    public void senKimsin () {
        System.out.println("Adım "+ adı+" Yaşım "+yas);
    }
    public void babaAdınNe () {
        System.out.println("Babamın  adı "+baba.adı+" ve " +baba.yas+"yaşında");
    }
    public void anneAdınNe () {
        System.out.println("Annemin  adı "+anne.adı+" ve " +anne.yas+"yaşında");
    }
    public void esAta(Insan insan) { es=insan; }
    public void cocukAta (Insan...adı) {
        for (Insan c:adı) {
            cocukları.add(c);

        }
    }
    public void cocuklarınıSoyle () {
        for (int i = 0; i < cocukları.size(); i++) {
            System.out.println(cocukları.get(i).adı+" ");
        }
    }

}
