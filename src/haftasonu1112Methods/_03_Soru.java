package haftasonu1112Methods;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Bir kişi, yaşı 18'den büyük veya ona eşitse oy kullanmaya uygundur.
        // Oy kullanmaya uygun olup olmadığını öğrenmek için bir method tanımlayın.
       Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı Giriniz : ");
       int yas = scan.nextInt();
       secmenKontrol(yas);


    }
    public static void secmenKontrol(int a) {
        if(a>=18) {
            System.out.println("Oyunuzu Kullanabilirsiniz");
        }
        else{
            System.out.println(" !!! OY KULLANAMAZSINIZ !!!");
        }
    }
}
