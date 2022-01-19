package gun36.foreach;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach4 {
    public static void main(String[] args) {

        ArrayList< Integer > list = new ArrayList<>(Arrays.asList(1,2,4,6,9,11,18));

        /*list.removeIf(n -> n % 2==0 || n%3==0 );*/
        list.removeIf(n -> n % 2==0 && n%3==0 );

        System.out.println(list);

    }
}
