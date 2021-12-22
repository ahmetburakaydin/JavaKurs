package gun26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {
        // HashMap in kendi  algoritması vardır.Ona göre sıralar

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"dog");
        hashMap.put(2,"cat");
        hashMap.put(3,"bird");
        hashMap.put(4,"snake");

        // LinkedHashMap : kullanıcı giriş sırasına göre sıralar.

        Map<Integer,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(9,"dog");
        linkedMap.put(2,"cat");
        linkedMap.put(3,"bird");
        linkedMap.put(4,"snake");

        // TreeMap :keylerin alfabetik  yada  numerik  olarak sıralar.

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(8,"dog");
        treeMap.put(7,"cat");
        treeMap.put(5,"bird");
        treeMap.put(4,"snake");

        System.out.println(hashMap);
        System.out.println(linkedMap);
        System.out.println(treeMap);



    }
}
