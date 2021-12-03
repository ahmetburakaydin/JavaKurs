package gun11;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı girin ");
        String sayi= scan.nextLine();

        char sayiBirler=sayi.charAt(sayi.length()-1);
        int intSayiBirler=Integer.parseInt(String.valueOf(sayiBirler));


        if(intSayiBirler==0){
            System.out.println("Birler Basamağı : "+"Sıfır");
        }else if (intSayiBirler==1){
            System.out.println("Birler Basamağı : "+"Bir");
        }else if (intSayiBirler==2){
            System.out.println("Birler Basamağı : "+"İki");
        }else if (intSayiBirler==3){
        System.out.println("Birler Basamağı : "+"Üç");
        }else if (intSayiBirler==4){
        System.out.println("Birler Basamağı : "+"Dört");
        }else if (intSayiBirler==5){
        System.out.println("Birler Basamağı : "+"Beş");
        }else if (intSayiBirler==6){
        System.out.println("Birler Basamağı : "+"Altı");
        }else if (intSayiBirler==7){
        System.out.println("Birler Basamağı : "+"Yedi");
        }else if (intSayiBirler==8){
        System.out.println("Birler Basamağı : "+"Sekiz");
        }else if (intSayiBirler==9){
        System.out.println("Birler Basamağı : "+"Dokuz");
        }

    }
}
