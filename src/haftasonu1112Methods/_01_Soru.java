package haftasonu1112Methods;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Kullanıcı tarafından girilen üç sayı arasından sırasıyla maksimum ve minimum sayıyı yazdırmak için iki
        //method tanımlayın.

       max();
       min();
    }
    public static void max (){
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Sayıyı girin");
        int a = scan.nextInt();
        System.out.println("2.Sayiyi girin");
        int b = scan.nextInt();
        System.out.println("3.sayiyi girin");
        int c = scan.nextInt();


        int enB= 0;
        if (a>b && a>c) {
            enB = a;
        }
        if(b>a && b>c) {
            enB=b;
        }
        if(c>a && c>b) {
            enB=c;
        }
        System.out.println("Maximum Sayi : "+ enB);

    }
    public static void min () {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Sayıyı girin");
        int a = scan.nextInt();
        System.out.println("2.Sayiyi girin");
        int b = scan.nextInt();
        System.out.println("3.sayiyi girin");
        int c = scan.nextInt();
        int enK= c;
        if (a<b && a<c) {
            enK = a;
        }
        if(b<a && b<c) {
            enK=b;
        }
        if(c<a && c<b) {
            enK=c;
        }
        System.out.println("Minimum Sayi : "+ enK);
    }
}
