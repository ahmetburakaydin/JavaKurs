package gun24;

import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        // HashSet kuralı uygulayan class <String> veya <Integer> veri tipi
        renkler.add("Mavi");
        renkler.add("Kırmızı");
        renkler.add("Yeşi");
        renkler.add("Mavi");
        //1. yazdırmak şekli
        System.out.println(renkler);

        // 2. yazdırma şekli
        for (String renk:renkler) {
            System.out.print(renk+" ");
        }



    }
}
