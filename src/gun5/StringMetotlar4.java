package gun5;

public class StringMetotlar4 {
    public static void main(String[] args) {

        String text = "Java güzel bir dil değildir";  // ilk ve son kelimeyi concat metotuyla yazdırın.
        int ilkBoslukIndexi = text.indexOf(" ");
        int sonBoslukIndexi = text.lastIndexOf(" ");
        String ilk =text.substring(0,ilkBoslukIndexi);
        String son = text.substring(sonBoslukIndexi);
        String birlesmişKelime = ilk.concat(son);
        System.out.println(birlesmişKelime+","+birlesmişKelime.length());



    }
}
