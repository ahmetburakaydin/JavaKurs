package gun17;

import java.util.regex.Pattern;

public class _02_DersSonuOdev {
    public static void main(String[] args) {
        /*
         Bir gazetede calisiyorunuz. Köse yazilarinin birinde 3. cümlenin sonunda "java"
        kelimesi eksik yazilmis. Bu hatayi düzeltecek bir program yazin.

        örnek köse yazisi su sekildedir:

        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.
        Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.
        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.
         */

        String paragraf =" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum." +
                " Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi." +
                " Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in";

        String [] strArray = paragraf.split("\\.");
        strArray[2]+=" Java";
        // for (int i = 0; i < strArray.length; i++)
        // strArray[2]=strArray[2].concat(" Java");
        // System.out.println(strArray[2]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i].concat("." ));
        }
    }
}
