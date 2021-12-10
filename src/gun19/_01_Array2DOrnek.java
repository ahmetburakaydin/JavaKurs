package gun19;

import java.util.Scanner;

public class _01_Array2DOrnek {
    public static void main(String[] args) {
        /*
        euro ve doların son 6 aydaki karşılıklarını bir tabloya ekleyin.
        bu tabloyu ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        int [][] dövizKuru = new int[6][2];

        for (int i = 0; i < dövizKuru.length; i++) {  // euro
            for (int j = 0; j < dövizKuru[i].length; j++) { // dolar
                if(j==0){
                    System.out.println("Dolar");
                    dövizKuru[i][j]= scan.nextInt();
                }else{
                    System.out.println("Euro");
                    dövizKuru[i][j]= scan.nextInt();
                }
            }
        }
        for (int i = 0; i < dövizKuru.length; i++) {
            for (int j = 0; j < dövizKuru[i].length; j++) {
                System.out.print(dövizKuru[i][j]+" ");

            }
            System.out.println();
        }

    }
}
