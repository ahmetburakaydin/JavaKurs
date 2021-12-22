package gun26;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {
        Map<String,String> bilgiler1 = new HashMap<>();
        bilgiler1.put("email","aburakayd@gmail.com");
        bilgiler1.put("phone","+903124395649");
        bilgiler1.put("adres","ankara");
        bilgiler1.put("cinsiyet","erkek");

        /*System.out.println(bilgiler1);*/
        /*System.out.println(bilgiler1.get("email"));  // verilen keyin valuesini yazar
        System.out.println(bilgiler1.get("cinsiyet")); // get(key) => values
        */

        Map<String,String> bilgiler2 = new HashMap<>();
        bilgiler2.put("email","aburakayd@gmail.com");
        bilgiler2.put("phone","+903124395649");
        bilgiler2.put("adres","ankara");
        bilgiler2.put("cinsiyet","erkek");

        Map<String,Map<String,String>> kisiBilgileri = new HashMap<>();

        // diğer veri tipleri içinde geçerlidir.

        kisiBilgileri.put("mehmet",bilgiler1);
        kisiBilgileri.put("abdullah",bilgiler2);

        System.out.println(kisiBilgileri);
        System.out.println(kisiBilgileri.get("mehmet"));
        System.out.println(kisiBilgileri.get("mehmet").get("email"));
        System.out.println(kisiBilgileri.get("abdullah"));
        System.out.println(kisiBilgileri.get("abdullah").get("adres"));

    }
}
