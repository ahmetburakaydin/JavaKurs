package haftasonutekrar2011;

public class Cumartesi1 {
    public static void main(String[] args) {
        String dize = "Kendini arayan , yitirmeden bulamaz. ";
        String sair = "Sezai Karakoç";

        int dizeUzunluk =dize.length();
        System.out.println(dizeUzunluk);

        int dizeSonKelime = dize.indexOf("b");
        System.out.println(dizeSonKelime);
        
        int dizeSonA = dize.lastIndexOf("a");
        System.out.println("dizeSonA = " + dizeSonA);
        
        int ikinciKelimeİlk =dize.indexOf("a");
        int ikinciKelimeSon=dize.indexOf(" ",ikinciKelimeİlk);
        String dizeIkinci = dize.substring(ikinciKelimeİlk,ikinciKelimeSon);
        System.out.println("dizeIkinci Kelime = " + dizeIkinci);
        
        int ucuncuKelimeIlk = dize.indexOf("yi");
        int ucuncuKelimeSon = dize.indexOf("b",ucuncuKelimeIlk);
        String ucuncuKelime = dize.substring(ucuncuKelimeIlk,ucuncuKelimeSon);
        System.out.println("ucuncuKelime = " + ucuncuKelime);

        char sonHarf=sair.charAt(sair.length()-1);
        System.out.println("sonHarf = " + sonHarf);

        char sairAltıncı=sair.charAt(6);
        System.out.println("sairAltıncı = " + sairAltıncı);
        
        String tamCumle = dize.concat(sair);
        System.out.println("tamCumle = " + tamCumle);
        
        String yeniKelime = ucuncuKelime.concat(dizeIkinci); // boşluk bırakma?
        System.out.println("yeniKelime = " + yeniKelime);

        String ayrac11 = "bul"; // ayracın öncesi ve sonrasi karakter sayıları ile birlikte yaz.

        int ayDex=dize.indexOf(ayrac11);

        String oncesiAyrac11=dize.substring(0,ayDex);
        System.out.println(oncesiAyrac11+" "+oncesiAyrac11.length());

        int aySonDex = ayDex+ayrac11.length();

        String sonrasıAyrac11=dize.substring(aySonDex);
        System.out.println(sonrasıAyrac11+" "+sonrasıAyrac11.length());

    }

}
