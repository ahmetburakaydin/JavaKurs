package gun12;

import java.util.Scanner;

public class _03_SwitchCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("2 tam sayı girin");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin : 't' , 'c' , 'p' , 'b' ");
        String islem = scan.next();

        switch (islem) {
            case "t":
                System.out.println("toplam : " + sayi1 + sayi2);
                break;
            case "c":
                System.out.println("cıkarma : " + (sayi1 - sayi2));
                break;
            case "p":
                System.out.println("carpma : " + (sayi1 * sayi2));
                break;
            case "b":
                if (sayi2!=0){
                    System.out.println(sayi1 / sayi2);
                }
                else {
                    System.out.println("tanımsız");
                }
                break;
            default:
                System.out.println("Geçersiz işlem");
        }
    }
}
