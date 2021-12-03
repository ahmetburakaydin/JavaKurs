package gun4;

public class _01_String {
    public static void main(String[] args) {
        /*
        //Aysenin toplamda 10000 lirasi vardir. Ayse 5000 lira ile tatil yapmistir.
        // Kalan parasi ile de hisse senedi almistir. Ama aysenin toplamda 3000 lira
        // bankaya borcu vardir. Ayse bu parayi odemek icin arkadasindan 4000 lira borc alir.
        // Aysenin elinde kalan parayi yazdiriniz
        */

        int toplam = 10000;
        int tatil = 5000;
        int hisseSenedi = 5000;
        int bankayaBorc= 3000;
        int alınanBorc=4000;

        int kalanPara = toplam+alınanBorc-tatil-hisseSenedi-bankayaBorc;

        String ayse = "Ayşenin Elinde Kalan Para ";
        String mesaj = " tldir.";
        System.out.println(ayse+kalanPara+mesaj);

    }
}
