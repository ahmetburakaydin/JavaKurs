package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>(Arrays.asList(3, 4, 5));
        HashSet<Integer> hashSet2 = new HashSet<>(Arrays.asList(8, 7, 6, 5));


        System.out.println(birlestir(hashSet1, hashSet2));
        System.out.println(fark(hashSet2, hashSet1));  // ters halide yazılabilir.
        System.out.println(ortakElemanlar(hashSet1,hashSet2));


    }

    public static HashSet<Integer> birlestir(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        HashSet<Integer> birlesikSet = new HashSet<>();
        birlesikSet.addAll(hashSet1);
        birlesikSet.addAll(hashSet2);
        return birlesikSet;
    }

    public static HashSet<Integer> fark(HashSet<Integer> hashSet1, HashSet<Integer> set) {
        HashSet<Integer> farkSet = new HashSet<>(hashSet1);
        farkSet.removeAll(set); // farkset Değişkenine hashset1 eklemiştik.
        return farkSet;

    }

    public static HashSet<Integer> ortakElemanlar(HashSet<Integer> hashSet1, HashSet<Integer> set) {
        HashSet<Integer> ortakSet = new HashSet<>(hashSet1);
        ortakSet.retainAll(set);
        return ortakSet;


    }

}
