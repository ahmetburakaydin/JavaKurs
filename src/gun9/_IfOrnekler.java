package gun9;

import java.util.Scanner;

public class _IfOrnekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Takımınızı girin : ") ;
        String takim =scanner.nextLine();

        if (takim.equalsIgnoreCase("Galatasaray")){
            System.out.println("Yaşa  Cimbom ");
        }
        else if (takim.equalsIgnoreCase("Fenerbahce")) {
            System.out.println("Yaşa Fener");
        }
        else
        System.out.println("Kapat Tv yi");


        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Yazın : ") ;
        int dogumYılı = scanner.nextInt();
        System.out.println("Şu anki yıl : ");
        int suAnYıl = scanner.nextInt();

        int yasınız = suAnYıl-dogumYılı;

        if(yasınız>=18){
            System.out.println("Ehliyet Alabilirsiniz.");
        }
        else{
            System.out.println("Ehliyet Alamazsınız !!! ");
        }
        */





        /*
        System.out.println("isminiz :");
        String isim =scanner.nextLine();

        if (isim.startsWith("A")){
            System.out.println("İsminiz A ile başlıyor");
        }
        else {
            System.out.println("İsmini A ile başlamıyor.");
        }

         */
    }
}
