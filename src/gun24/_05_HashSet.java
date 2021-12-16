package gun24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _05_HashSet {
    public static void main(String[] args) {

        HashSet<Integer>integerHashSet =new HashSet<>();

        HashSet<String>stringHashSet = new HashSet<>();

        HashSet<Object>objectHashSet = new HashSet<>();
        ArrayList<Object>objectArrayList=new ArrayList<>();
        Object[] nums= new Object[2];

        objectHashSet.add(12);
        objectHashSet.add("asya");
        objectHashSet.add(true);
        objectHashSet.add(3.14);


        System.out.println(objectHashSet);
    }
}
