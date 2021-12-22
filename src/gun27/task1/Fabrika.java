package gun27.task1;

public class Fabrika {
    public static void main(String[] args) {
        Otomobil otomobil = new Otomobil();
        // new Otomobil() otomobil nesnesi üretir.


        otomobil.renk = "yeşil";
        otomobil.kacKapı=5;
        otomobil.motorHacmi=1.6;
        otomobil.marka="Audi";
        otomobil.modelYılı=2021;


        otomobil.arabaMarkaVeModel(otomobil.marka, otomobil.modelYılı);

        Otomobil otomobil2= new Otomobil();
        otomobil2.renk = "mavi";
        otomobil2.marka="Dacia";

        Otobus otobus1 = new Otobus();
        otobus1.motorHacmi=5000;
        otobus1.modelYılı=2020;
        otobus1.model="Mercedes";
    }
}
