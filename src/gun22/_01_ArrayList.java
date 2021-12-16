package gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ArrayList {
    public static void main(String[] args) {
        int [] intDizi=new int[5]; // kaç eleman olduğunu tanımlarken belirtilmesi zorunlu.

        ArrayList<Integer> integerArrayList=new ArrayList<>();

        // ArrayListin kaç eleman tutacağını belirtmemize gerek yok.

        ArrayList<String> stringArrayList=new ArrayList<>();
        // string tipinde veri tutar.
        ArrayList<Boolean> booleanArrayList=new ArrayList<>();
        // boolean tipinde veri tutar.
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        // double tipinde veri tutar.

        // Ders kaydedecek bir arraylist oluşturun.

        ArrayList<String> dersler = new ArrayList<>();

        // listeye eleman ekleme
        dersler.add("Matematik");  //0.İndis
        dersler.add("Türkce");
        dersler.add("Fizik");
        dersler.add("Almanca");  // 3.İndis
        // listlere ekleme yaparken  hep en sona ekler .


        System.out.println("dersler = " + dersler);  // Listlerde Arrays.toString metoduna gerek yok.

        dersler.add(3,"Ingilizce");  // 3.indise ekleyip 3.indistekini 4.indise kaydırıyor.
        System.out.println("dersler = " + dersler);

        String trDers = dersler.get(1); // liste içerisindeki elemani index değeri ile çekme
        System.out.println("trDers = " + trDers);

        dersler.set(4," Kimya");  // indisteki verilen ifadeyle değiştirir.
        System.out.println("dersler = " + dersler);

        int uzunluk=dersler.size();
        System.out.println("uzunluk = " + uzunluk);

        boolean bosMuDolumu = dersler.isEmpty(); // listenin bos olup olmadığını  kontrol ediyor.
        System.out.println("bosMuDolumu = " + bosMuDolumu);

        dersler.remove("Almanca"); // belirtilen değeri siler
        System.out.println("dersler = " + dersler);

        dersler.remove(1); // belirtilen indexi siler
        System.out.println("dersler = " + dersler);

        int index= dersler.indexOf("Kimya");  //  Verilen değerin  indexini bulmaya yarar.
        System.out.println("index = " + index);

        // for döngüsü ile döndürme

        for (int i = 0; i < dersler.size(); i++) {
            System.out.print(dersler.get(i)+" ");

        }
        /*dersler.clear(); // ArrayListin içindeki verileri temizliyor.
        System.out.println("index = " + index);
*/

    }
}
