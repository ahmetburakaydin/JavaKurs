package gun34.soyayacıyeni;

public class Main {
    //        adi
    //        Insan anne
    //        Insan baba
    //        Insan es
    //        cocuklar -> ArrayList<Insan>

    public static void main(String[] args) {
        Insan zeliha= new Insan("Zeliha",60);
        Insan murat= new Insan("Murat",69);

        Insan ayse =new Insan("Ayşe",36,zeliha,murat);
        Insan k1 =new Insan("Eren",33);
        ayse.esAta(k1);
        Insan enes = new Insan("Enes",7,ayse,k1);
        Insan zehra = new Insan("Zehra",4,ayse,k1);

        Insan zeynep =new Insan("Zeynep",35,zeliha,murat);
        Insan muhammed = new Insan("Muhammed",39);
        zeynep.esAta(muhammed);
        Insan yusufKerem=new Insan("Yusuf Kerem",8,zeynep,muhammed);
        Insan elifDuru =new Insan("Elif Duru ",5,zeynep,muhammed);

        Insan ahmetBurak = new Insan("Ahmet Burak",32,zeliha,murat);
        Insan esra = new Insan("Esra",29);
        ahmetBurak.esAta(esra);
        Insan asya = new Insan("Asya Betül",3,esra,ahmetBurak);








    }
}
