package gun9;

import java.util.Scanner;

public class _02IfOrnekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();

        if(sayi>0){
            System.out.println("Pozitif Sayı");
        }
        else if (sayi<0){
            System.out.println("Negatif Sayı");
        }
        else{
            System.out.println("Sıfır");
        }
    }
}
