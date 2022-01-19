package gun34.soru;

public class Main {
    static Mevsim suAnKiMevsim=Mevsim.BAHAR;

    public static void main(String[] args) {
        Ayakkabı a1 = new Ayakkabı(Mevsim.BAHAR,Marka.NIKE,42);
        Ayakkabı a2 = new Ayakkabı(Mevsim.YAZ,Marka.HOTIC,42);
        Ayakkabı a3 = new Ayakkabı(Mevsim.KIS,Marka.GREYDER,42);


        Insan i1 = new Insan("Ahmet",42);
        i1.ayakkabıGiy(a1);
        i1.gez();
        i1.ayakkabıyıCıkar();
        i1.geriGel();
        i1.ayakkabıyıCıkar();
        i1.gez();
        i1.ayakkabıGiy(a2);
        i1.gez();







    }


}
