package gun11;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Araların virgül olacak şekilde 2 tam sayı girin" );
        String sayilar =scan.nextLine();

        int virgul=sayilar.indexOf(",");
        String sayi1=sayilar.substring(0,virgul);
        String sayi2=sayilar.substring(virgul+1);

        int int1=Integer.parseInt(sayi1);
        int int2=Integer.parseInt(sayi2);

        System.out.println("Büyük Olan sayı : "+Math.max(int1,int2));






    }
}
