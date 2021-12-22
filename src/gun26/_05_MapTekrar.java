package gun26;

import java.util.HashMap;
import java.util.Map;

public class _05_MapTekrar {
    public static void main(String[] args) {

        Map<String,Integer> dersVeNot = new HashMap<>();
        dersVeNot.put("Fizik",75);
        dersVeNot.put("Kimya",80);
        dersVeNot.put("Bioloji",72);

        Map<String,Integer> dersVeNot2= new HashMap<>();
        dersVeNot.put("Fizik",90);
        dersVeNot.put("Kimya",67);
        dersVeNot.put("Bioloji",83);

        Map<String,Map<String,Integer>> users = new HashMap<>();
        Map<String,Map<String,Integer>> users2 = new HashMap<>();

        users.put("Ahmet",dersVeNot);
        users2.put("Asya",dersVeNot2);





    }
}
