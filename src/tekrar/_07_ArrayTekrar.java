package tekrar;

import java.util.Scanner;

public class _07_ArrayTekrar {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cümle girmesini isteyin
        bu cümledeki kelime sayisini bulun
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Cümle Girin:");
        String str = scan.nextLine();

        String [] strArray=new String[str.length()];
        int kelimeSayisi=1;

        for (int i = 0; i < strArray.length; i++) {
            strArray[i]= String.valueOf(str.charAt(i));
                if(str.charAt(i)==' '){
                    kelimeSayisi++;
                }

        }
        System.out.println("cümledeki kelime sayısı :"+kelimeSayisi);

    }
}
