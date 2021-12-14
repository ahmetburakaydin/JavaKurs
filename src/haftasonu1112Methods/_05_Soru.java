package haftasonu1112Methods;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Kullanıcı tarafından girilen iki sayının çarpımını döndüren bir method tanımlayın.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi Girin : ");
        int num1= scan.nextInt();
        System.out.println("Bir Sayi Girin : ");
        int num2= scan.nextInt();
        carpim(num1,num2);
    }
    public static void carpim(int a , int b) {
        int carpim1;
        carpim1=a*b;
        System.out.println("Sayıların Carpimi : " +carpim1);
    }
}
