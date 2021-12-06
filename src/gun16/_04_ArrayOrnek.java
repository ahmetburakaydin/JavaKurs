package gun16;

import java.util.Scanner;

public class _04_ArrayOrnek {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 tane  isim girmesini isteyin.
        Bu isimlerden  uzunluğu 6 dan buyuk kaç eleman olduğunu bulun .
         */
        Scanner scan = new Scanner(System.in);
        String[] array= new String[5];
        int miktar = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir Eleman Girin");
            array[i]=scan.nextLine();
            if(array[i].length()>6) {
                miktar++;
            }

        } System.out.println(miktar);


    }
}
