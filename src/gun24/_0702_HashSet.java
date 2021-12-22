package gun24;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class _0702_HashSet {
    public static void main(String[] args) {
        String str = "aabbbbffffggggttdd";
        System.out.println(duzenle(count(str)));

    }
    public static String[] count (String str) {

        String [] countLetter=new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
           int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                countLetter[i]= count + String.valueOf(str.charAt(i));
            }
        }
        return countLetter; // array
    }
    public static String duzenle (String []array) {

        String yeniStr="";
        HashSet<String> countLetterSet = new HashSet<>(Arrays.asList(array));
        for (String countLetter:countLetterSet) {
            yeniStr+=countLetter;
        }
        return  yeniStr;

    }
}









