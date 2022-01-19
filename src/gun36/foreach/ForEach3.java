package gun36.foreach;

import java.util.LinkedHashMap;

public class ForEach3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String > map = new LinkedHashMap<>();
        map.put(11,"Ahmet");
        map.put(12,"Burak");
        map.put(13,"Aydın");
        map.put(14,"Asya");
        map.put(15,"Betül");
        map.put(16,"Esra");
        System.out.println();

        map.forEach((a,b) -> System.out.println(a+","+b));
    }
}
