package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _082_Hashsetsoru {
    public static void main(String[] args) {
        /*
        aaabbbfffgggtttddd bu sekilde yazilmis bir kelimeyi düzenleyecek bir metot yazin.
          ciktisi bu sekilde olacaktir -> 3a3b3f3g3t3d bu soruyu HashSet kullanarak cözmeye calisin.
         */

        System.out.println(duzenleme("aaabbbfffgggtttddd"));
    }
    public static String duzenleme(String str){
        String[]array=str.split("");
        HashSet<String> harfler=new HashSet<>(Arrays.asList(array));
        String yeniStr="";
        int count;
        for (String harf:harfler) {
            count=0;
            for (int i = 0; i < array.length; i++) {
               if(harf.contains(array[i])){
                   count++;
               }
            }
            yeniStr=count+harf;
            System.out.print(yeniStr);


        }
        return yeniStr;
    }
}
