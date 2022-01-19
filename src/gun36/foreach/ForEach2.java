package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach2 {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList<>(Arrays.asList(1,2,4,6,9,11,18));

        list.forEach(a -> {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
        });
    }
}
