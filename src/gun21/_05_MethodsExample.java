package gun21;

import java.util.Scanner;

import static gun19._02_Methods.menuYaz;

public class _05_MethodsExample {
    public static void main(String[] args) {

        /*
         Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
         her bir menü elemanını değer alan bir fonksiyon yazınız.
            1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
         Bir işlem seçiniz
         */
        Scanner scan= new Scanner(System.in);
        int secim ;
        do {
            menuYaz();
            System.out.println("Bir işlem Seçin");
            secim = scan.nextInt();
            islemYap(secim);
        }while(secim<6);
    }
    public static void menuYaz(){
        System.out.println("****** MENU ******");
        System.out.println("1 - Toplama ");
        System.out.println("2 - Çıkarma ");
        System.out.println("3 - Carpma ");
        System.out.println("4 - Bölme");
        System.out.println("5 - Faktöriyel");
        System.out.println("6 - Çıkış");
    }
    public static  void islemYap(int islem){
        Scanner scan= new Scanner(System.in);
        int num1,num2;
        switch (islem){
            case 1 :
                System.out.println("1.Sayıyı Girin");
                num1=scan.nextInt();
                System.out.println("2.Sayıyı Girin");
                num2=scan.nextInt();
                toplam(num1,num2);
                break;
            case 2 :
                System.out.println("1.Sayıyı Girin");
                num1=scan.nextInt();
                System.out.println("2.Sayıyı Girin");
                num2=scan.nextInt();
                cıkarma(num1,num2);
                break;
            case 3 :
                System.out.println("1.Sayıyı Girin");
                num1=scan.nextInt();
                System.out.println("2.Sayıyı Girin");
                num2=scan.nextInt();
                carpma(num1,num2);
                break;
            case 4 :
                System.out.println("1.Sayıyı Girin");
                num1=scan.nextInt();
                System.out.println("2.Sayıyı Girin");
                num2=scan.nextInt();
                bölme(num1,num2);
            case 5 :
                System.out.println("Bir sayi girin");
                num1=scan.nextInt();
            case 6 :

        }
    }
    public static void toplam (int num1,int num2){
        System.out.println("toplam : "+(num1+num2));
    }
    public static void cıkarma (int num1,int num2) {
        System.out.println("cıkarma : " + (num1 - num2));
    }
    public static void carpma (int num1,int num2) {
        System.out.println("carpma : " + (num1*num2));
    }
    public static void bölme (int num1,int num2) {
        if(num1>0) {
        System.out.println("bölme : " + (num1/num2));
        }else
            System.out.println("Tanımsız");

    }

}
