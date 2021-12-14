package HaftaSonu1112Arrays;

import java.util.Arrays;

public class _06_Soru {
    public static void main(String[] args) {
        // 2B dizinin tüm öğelerini tanımlayın (decleration), deger atayın (initialization) ve yazdırın,
        int [] b2 = new int[5];
        b2[0] = 5;
        b2[1] = 10;
        b2[2] = 15;
        b2[3] = 20;
        b2[4] = 25;

        System.out.println(Arrays.toString(b2));
        for (int i = 0; i < b2.length; i++) {
            System.out.print(b2[i]+" ");

        }

    }
}
