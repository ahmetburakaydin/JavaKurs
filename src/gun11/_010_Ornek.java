package gun11;

import java.util.Scanner;

public class _010_Ornek {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("3 tane sayı girin : "); //3 sayıdan büyük olanını yazdırın.
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();

        int enBuyuk =sayi1;
        int enKucuk =sayi1;

        if(sayi2>enBuyuk) sayi2=enBuyuk;

        if(sayi3>enBuyuk) sayi3=enBuyuk;

        if(sayi2<enKucuk) sayi2=enKucuk;

        if(sayi3<enKucuk) sayi3=enKucuk;

        System.out.println("En Küçük Sayı : "+enKucuk);
        System.out.println("En Büyük Sayi : "+enBuyuk);
    }
}
