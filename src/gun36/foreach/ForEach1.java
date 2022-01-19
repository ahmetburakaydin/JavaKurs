package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ForEach1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,7,15,22));

        for (Integer integer : list) {
            System.out.print(integer+", ");
        }

        System.out.println();

        list.forEach(integer -> System.out.print(integer+", "));






    }
}
