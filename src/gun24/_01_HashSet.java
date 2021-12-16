package gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> hashSet =new HashSet<>(); // arraylisten farkı tekrar eden veriyi almıyor

        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(4); // tekrar eden veri olduğu için yazmaz.

        System.out.println("hashSet = " + hashSet);


    }
}
