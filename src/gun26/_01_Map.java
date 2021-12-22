package gun26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _01_Map {
    public static void main(String[] args) {
        HashSet<Long> tcNo=new HashSet<>();
        tcNo.add(47707097506L);
        tcNo.add(47707097508L);

        System.out.println(tcNo);

        Map<String,Integer> ogrNotlar = new HashMap<>();
            // sol taraf key denir
            // sağ taraf value deniz.

        ogrNotlar.put("abdullah",90);
        ogrNotlar.put("fatma",89);
        ogrNotlar.put("mehmet",67);
        ogrNotlar.put("celil",100);
        ogrNotlar.put("mehmet",99); // ikinci defa yazıldığında ilk veriyi update ediyor. bir tanesi yazılmış oluyor.

        //1.yazdırma yolu
        System.out.println(ogrNotlar);
        System.out.println(ogrNotlar.get("abdullah"));
        System.out.println(ogrNotlar.keySet());// keylerin tamamını yazar.
        System.out.println(ogrNotlar.values()); // valulerin tamamını yazar.

        //2.yazdırma  yolu
        for (String str:ogrNotlar.keySet()) {  // keyleri yazdırma yolu
            System.out.println(str);
            
        }
        for (Integer not : ogrNotlar.values()) { // value yazdırma yolu
            System.out.println(not);

        }
        for(Map.Entry<String,Integer> keyVeValues : ogrNotlar.entrySet()){ // key ve values i birlikte cıkartır.
            System.out.println(keyVeValues);
            System.out.println(keyVeValues.getKey());
            System.out.println(keyVeValues.getValue());
        }

        boolean buKeyVarmı =ogrNotlar.containsKey("ahmet");
        // containsKey() tüm keylere bakar bu key varmı diye ;
        boolean buValueVarmı= ogrNotlar.containsValue(89);
        // containsValue() tüm valuelere bakar bu value varmı diye
        System.out.println(buKeyVarmı);
        System.out.println(buValueVarmı);

        ogrNotlar.remove("mehmet");
        // mehmet keyini siler haliyle bu keyin valueside silinir.
        // ogrNotlar.clear(); // bu ise tüm map i siler . ilk tanımlanmış boş haline döner.


    }
}
