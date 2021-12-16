package gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayList {
    public static void main(String[] args) {
        // listeye direk veri eklemenin yolu 1.yolu Arrays.asList() dir.
        ArrayList<String> isimler =new ArrayList<>(Arrays.asList("ahmet","burak","aydın"));
        System.out.println("isimler = " + isimler);
        System.out.println("isimler size = " + isimler.size());

        // listeye direk veri eklemenin yolu 2.yolu
        ArrayList<String> dersler = new ArrayList<>(){
            {
                add("Matematik");
                add("Fizik");
                add("Kimya");
                add("Bioloji");
            }
        };

        isimler.addAll(dersler); // dersler listesini isimler listesine ekliyor.
        System.out.println("isimler = " + isimler);
        
        isimler.remove(dersler); // dersler listesini isimler listesini çıkarıyor.
        System.out.println("isimler = " + isimler);

        if(isimler.contains("Mehmet")) // contains () metodu listenin tamamını kontrol ediyor.
            System.out.println("Mehmet Liste içinde var");


    }
}
