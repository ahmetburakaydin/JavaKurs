package gun44.polimorphism1;

import gun43.ornek1.Calisan;

public class Main {
    public static void main(String[] args) {
        Calısan c1 = new Calısan("ali",1000);

        Ogrenci o1 = new Ogrenci("veli","Istanbul");

        calisaniIsimYaz(c1);
        ogrenciIsimYaz(o1);
        insanIsimYaz(c1);
        insanIsimYaz(o1);


    }
    public static void insanIsimYaz(Insan i1 ){

    }

    public static void calisaniIsimYaz(Calısan c1) {
        System.out.println(c1);
    }

    public static void ogrenciIsimYaz(Ogrenci o1){
        System.out.println(o1);
    }

}
