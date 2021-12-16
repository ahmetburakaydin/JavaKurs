package gun22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _02_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> sayılar = new ArrayList<>();

        sayılar.add(12);
        sayılar.add(24);
        sayılar.add(36);
        sayılar.add(48);
        System.out.println("listin ilk hali = " + sayılar);

        // Arrays.sort() yerine Collections.sort(list) kullanılır.
        Collections.sort(sayılar);
        System.out.println("List düzenlentikten sonra = "+ sayılar);

        Collections.reverse(sayılar);
        System.out.println("Listi Tersden Yazdırma = "+ sayılar);


        System.out.println("Listteki max değer = "+Collections.max(sayılar));
        System.out.println("Listteki min değer = "+Collections.min(sayılar));

        Collections.fill(sayılar,3); // listedeki tüm verilerin  yerine yazdığımız ifadeyi yazar
        System.out.println("sayılar = " + sayılar);

        Collections.replaceAll(sayılar,45,3);
        System.out.println("sayılar = " + sayılar);





    }
}
