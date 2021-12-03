package gun14;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {
        /*
        başlangıc ve bitiş değerlerini kullanıcıdan alarak  bu aralıktaki
        sayiların toplamını ekrana yazdırın.(sayilar dahil)
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Başlangıç değeri girin :");
        int baslangıc= scan.nextInt();

        System.out.println("bitiş değeri girin :");

        int bitis=scan.nextInt();

        int toplam = 0 ;

        if (baslangıc<bitis){ //  if içerisinde kullanmamızın sebebi kullanıcının başlangıc değerini bitişten büyük girme ihtimali
            for (int i=baslangıc;i<=bitis;i++){   // başlangıç ve bitiş değerleri belirtilere döngü oluşturuluyor.
                toplam+=i; // toplam =toplam +i (döngüde kullanılan sayıyı sürekli toplama ekleyerek devam ediyor.
            }
        }
        else {
            for (int j=baslangıc;j<=bitis;j--){ // başlangıcın > bitiş den büyük olduğu durumda döngünün yönünü değiştirerek
                toplam+=j;                      // devam ettirir ve kullanılan sayıyı toplama ekleyerek devam ettirir.
            }

        }
        System.out.println("toplam = "+toplam); // toplamı en sonda if in ve ya for döngüsünün dışında yazdırıyoruz.


    }
}
