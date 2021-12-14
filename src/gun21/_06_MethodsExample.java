package gun21;

import java.util.Arrays;

public class _06_MethodsExample {
    // aaabbbfffgggtttddd
    public static void main(String[] args) {
        String str = "aaabbbfffgggtttddd";

        //String [] harfler =str.split("");
        //System.out.println(Arrays.toString(harfler));
        int aMiktar = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                aMiktar++;


            }
        }
    }
    public static void düzenlenme(String str) {
        String yeniHali = "";
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            
        }
    }
}
