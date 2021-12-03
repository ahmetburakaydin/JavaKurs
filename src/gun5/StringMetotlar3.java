package gun5;

public class StringMetotlar3 {
    public static void main(String[] args) {
        String str1 = "Ahmet";

        String str2 = new String("Burak");

        System.out.println(str1+str2);

        String isim ="Ahmet Burak";
        String soyisim = " Aydın";

        System.out.println(isim.concat(soyisim));
        System.out.println("Ahmet Burak".concat(" Aydın").concat(" 1/A"));


    }
}
