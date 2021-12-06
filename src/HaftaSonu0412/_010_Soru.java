package HaftaSonu0412;

import java.util.Scanner;

public class _010_Soru {
    //Kullanıcıdan iki sayı girmesini isteyen bir do-while döngüsü yazın. Sayılar eklenmeli ve
    //toplam görüntülenmelidir. Döngü, kullanıcıya işlemi tekrar yapmak isteyip istemediğini sormalıdır.
    //Eğer öyleyse, döngü tekrar etmelidir; aksi halde sonlandırılmalıdır
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =0;
        int sayi = 0;
        int toplam=0;
        do {
            System.out.println("Bir sayı Girin");
            sayi= scan.nextInt();
            i++;
            toplam+=sayi;
        }while (i< 2);{
            scan.nextLine();
            System.out.print("İşlemi Tekrar Etmek İstermisiniz ? 'Y' yada 'N' :" );
            String cevap=scan.nextLine();
            if (cevap.equalsIgnoreCase("n")) {
                    System.out.println("Teşekkürler");
            }
            else if (cevap.equalsIgnoreCase("y")){
                // contunie
            }

        }
        System.out.println("Toplam = "+toplam);


    }
}
