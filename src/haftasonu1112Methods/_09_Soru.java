package haftasonu1112Methods;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        //Bir sayının faktöriyelini 'Faktöriyel' adında bir yöntem tanımlayarak yazdıran bir program yazın
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Girin : ");
        int num = scan.nextInt();
        faktoriyel(num);
    }
    public static void faktoriyel (int a) {

        int carpim =1;
        for (int i = a; i >1 ; i--) {
           carpim*=i;
        }
        System.out.println("Sayının Faktöriyeli : "+ carpim);
    }
}
