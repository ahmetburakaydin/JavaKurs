package gun5;

public class StringMetotlar5 {
    public static void main(String[] args) {

        String metin1 ="Java dünyasina hosgeldiniz";
        String ayrac = "hos";

        int öncekiIndex =metin1.indexOf(ayrac);
        String öncekiUzunluk = metin1.substring(0,öncekiIndex);
        System.out.println(öncekiUzunluk+ ","+ öncekiUzunluk.length());

        int sonrakiIndex = öncekiIndex+ayrac.length();

        String sonrakiUzunluk = metin1.substring(sonrakiIndex);
        System.out.println(sonrakiUzunluk+ ","+sonrakiUzunluk.length());



    }
}
