package HaftaSonu1112Arrays;

import java.util.Scanner;

public class _012_Soru {
    public static void main(String[] args) {
        int[][] array=new int[3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter number : ");
                array[i][j]= scan.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");

            }
            System.out.println();
        }
    }
}
