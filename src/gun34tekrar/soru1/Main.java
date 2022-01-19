package gun34tekrar.soru1;

public class Main {
    static Mevsim suAnKiMevsim=Mevsim.BAHAR;
    public static void main(String[] args) {
        Ayakkabı a1=new Ayakkabı(Mevsim.KIS,Marka.BOT,42);
        Ayakkabı a2=new Ayakkabı(Mevsim.YAZ,Marka.GUNLUK,42);
        Ayakkabı a3=new Ayakkabı(Mevsim.BAHAR,Marka.SPOR,42);

        Insan  i1 = new Insan("ahmet",42);

        i1.ayakkabıGiy(a3);
        i1.ayakkabıGiy(a2);
        i1.geriGel();
        i1.gez();
        i1.ayakkabiCikar();
        i1.ayakkabiCikar();
        i1.geriGel();
        i1.ayakkabiCikar();
        suAnKiMevsim=Mevsim.KIS;
        i1.ayakkabıGiy(a1);
        i1.ayakkabiCikar();
        i1.ayakkabiCikar();
        i1.gez();



    }
}
