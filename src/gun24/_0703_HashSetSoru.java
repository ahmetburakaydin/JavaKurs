package gun24;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class _0703_HashSetSoru {
    public static void main(String[] args) {
        // aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek
        // bir metot yazin.
        //  ciktisi bu sekilde olacaktir ->
        //  3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.
        String str = "aaabbbbbbbbfffgggtttddd";

        duzenli("aaabbbbbbbbfffgggtttddd");
    }
    public static void duzenli(String str) {
        String yeniStr= "";
        String [] array=str.split("");
        TreeSet<String> harflerSet= new TreeSet<>(Arrays.asList(array));

        for (String harf:harflerSet) {
            yeniStr+=count(str,harf)+harf;
        }

        System.out.println(yeniStr);
        /*
        for (String harf:lists) {               bu satıra gelindiğinde ,harflerSet içindem alınan string harf ile
            yeniStr+=count(str,harf)+harf;      count metodu içindeki str ve üstteki harf parametreleriyle çalıştırılıyor.
        }                                       yeniStr ifadesine  ;count(str,harf)+harf =>
                                                yani belirtinlen harfin sayisi ve belirtilen harf eklenmiş oluyor.
         */


    }
    public static int count(String str,String harf) {  // bu methodta belirtilen harfin miktarı bulunuyor.
        int miktar = 0;                                // ancak harfin belirtme işlemi foreachle TreeSetin için alınan.
       for (int i = 0; i < str.length(); i++) {        // harfle sağlanıyor.(Veri Girmeye gerek kalmadan )
           String s = String.valueOf(str.charAt(i));
           if (harf.equals(s)) {
               miktar++;
           }

       }
        return miktar;
    }





}
