package gun24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class _07_HashSetDersSonuSoru {
    public static void main(String[] args) {
        /*
        aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
          ciktisi bu sekilde olacaktir -> 3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.
         */


        duzenleme("aaaabbbbffffggggttttdddd");

    }
    public static String  duzenleme (String str) {
        String[] array = str.split("");
        HashSet<String> harfler = new HashSet<>(Arrays.asList(array));
        String yeniStr = "";
        int index = 0;
        for (String harf : harfler) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (harf.contains(array[i]))
                    count++;
                }
            yeniStr = count + harf;
            System.out.print(yeniStr);
        }
        return yeniStr;
    }

}
