package gun1;

public class DenemeTahtası {
    public static void main(String[] args) {
        String isim=" Asya Betül ";
        String soyisim="Aydın";

        String ikinci=isim.substring(4);
        System.out.println("ikinci isim = " + ikinci);

        char sekizinci =isim.charAt(7);
        System.out.println("sekizinci harf = " + sekizinci);

        char soyadbirinci =soyisim.charAt(0);

        System.out.println("adının sekizinci harfi = " + sekizinci + " soyadının birinci harfi = "+ soyadbirinci);
        
        String tamad = isim+soyisim;
        System.out.println("tamad = " + tamad);

        int adUzunluk = tamad.length();
        System.out.println(adUzunluk);
        
        char sonharf = tamad.charAt(tamad.length()-1);
        System.out.println("sonharf = " + sonharf);

        String tersden = soyisim+isim;
        System.out.println(tersden);

        String orta2 = tamad.substring(8,14);
        System.out.println("orta2 = " + orta2);
    }
}
