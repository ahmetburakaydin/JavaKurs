package gun24;

import java.util.Arrays;
import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {
        /*
        1-10 arasında
         */

        HashSet <Integer> randomSet=new HashSet<>();

        while(randomSet.size()<10) {
            int num=(int) (Math.random()*100);
            randomSet.add(num);

        }
        System.out.println("randomSet "+randomSet);

        // oluşturduğumuz seti bir diziye atalım
        //1.yol
        Integer[] array =new Integer[randomSet.size()];
        int index = 0;
        for (Integer num :randomSet) {
            array[index] = num;
            index++;
        }
        //2.yol
        Integer [] array2= new Integer[randomSet.size()];
        array2 = randomSet.toArray(new Integer[randomSet.size()]);

        //Integer [] array2=randomSet.toArray(new Integer[randomSet.size()]);


        System.out.println(Arrays.toString(array));

        


        /*int[] nums= new int[10];
        for (int i = 0; i < nums[i]; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(nums));*/
        /*for (int i = 0;  i< set1.size(); i++) {
                set1.addAll(nums[i]);
            }
        System.out.print(set1+" ");
        }*/



    }
}
