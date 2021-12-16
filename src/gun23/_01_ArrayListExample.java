package gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ArrayListExample {
    public static void main(String[] args) {
        //bir öğretmen için istedği kadar not girebileceği  ve notları girdikten sonra
        // ortalamayı geçen  öğrenci sayisini bulan bir program  yazın.



        Scanner scanNot = new Scanner(System.in);   // integer girişi
        Scanner scanEvetHayır = new Scanner(System.in); // string girişi

        ArrayList<Integer> notlarListesi=new ArrayList<>();
        String cevap;
        do {
            System.out.println("Not Girin :");
            int not = scanNot.nextInt();
            notGirisi(not, notlarListesi);
            System.out.println("Başka bir not girmek istiyormusunuz ? ");
            cevap = scanEvetHayır.next();
        }
        while (cevap.equalsIgnoreCase("evet")) ;

        ortalamayıGecenler(notlarListesi);
    }
    public static void ortalamayıGecenler (ArrayList<Integer>notlarListesi) {
        int toplam =0;
        int ortalama= 0;
        int ortalamayıGeçenSayısı=0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            toplam += notlarListesi.get(i);
        }
        ortalama=toplam/ notlarListesi.size();

        for (int i = 0; i < notlarListesi.size(); i++) {
            if(notlarListesi.get(i)>ortalama)
                ortalamayıGeçenSayısı++;


        }
        System.out.println("Ortalama "+ortalama);
        System.out.println("Ortalamayı Gecen Sayısı :"+ortalamayıGeçenSayısı);
}
    public static void notGirisi (int not,ArrayList<Integer> notlarListesi) {
        notlarListesi.add(not);
    }
}
