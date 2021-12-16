package gun22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _05_ArrayList {
    public static void main(String[] args) {
        // kullanıcıdan bir cümle girmesini isteyin bu cümleyi tersden yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("bir Cümle Girin : ");
        String cümle = scan.nextLine();
        String []parcaCumle=cümle.split(" ");
        ArrayList<String> kelimeler = new ArrayList<>();

        for (int i = 0; i < parcaCumle.length; i++) {
            kelimeler.add(parcaCumle[i]);
        }
        Collections.reverse(kelimeler);
        for (int i = 0; i < kelimeler.size(); i++) {
            System.out.print(kelimeler.get(i)+" ");
        }



    }
}
