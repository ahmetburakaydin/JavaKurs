package gun11;

import java.util.Locale;

public class _03_Ornek {
    public static void main(String[] args) {
        String str ="gönüldağı yağmur yağmur"; // verilen değerin ilk yarısını yazdırın.

        int strUzunluk=str.length();
        System.out.println(strUzunluk);
        String ilkYarısı=str.substring(0,strUzunluk/2);
        System.out.println("ilk yarısı : "+ilkYarısı);

        String ikinciYarısı=str.substring(strUzunluk/2);
        System.out.println("ikinci yarısı : "+ikinciYarısı);

        String yeniStr2=ikinciYarısı+ilkYarısı;
        System.out.println(yeniStr2);


        char ilkHarf =str.charAt(0);
        char ikinciHarf=str.charAt(strUzunluk-1);
        System.out.println("1.Harf : "+ ilkHarf+", "+"Son Harf : "+ikinciHarf);

        //Bir String tanımlayın. Tüm metin kücük harflerden oluşsun. Bulmanız gereken ilk harfin son geçtiği indexi bulmak

        String kucukstr =str.toLowerCase(Locale.ROOT);

        char birinciHarf=kucukstr.charAt(0);
        System.out.println("birinci harf :"+birinciHarf);

        int indexSonYer=kucukstr.lastIndexOf(birinciHarf);
        System.out.println(indexSonYer);

        char sonHarf =str.charAt(str.length()-1);

        String kalanStr=str.substring(1,strUzunluk-1);

        String yeniStr=sonHarf+"".concat(kalanStr).concat(ilkHarf+"");
        System.out.println("eski hali : "+str);
        System.out.println("yeni hali : "+yeniStr);




    }
}
