package gun27.task2;

import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        // normalde ogrenci classıyle tek bir öğrenci nesnesi oluşturmak için;
        // Ogrenci ogrenci1=new Ogrenci() kullanırız; 1 adet ogrenci1 nesnesini oluşturdum. (içerisinde veri olmayan.)
        // 0grenci Classında tanımlanan methotlarla içerisine veri aktarabiliriz.

        // bu işlemi 10 öğrenciye uygulamak için ise  'Ogrenci ' classıyla bir array tanımlarım.
        Ogrenci [] ogrenciler = new Ogrenci[10];

        // ogrenciler adında için 10 öğrencilik yeri olan ama  Ogrenci classında  bir array tanımlamış olduk.


        // bu arrayin(öğrenciler) elemanlarınına yani öğrencilerine veri atamak için for döngüsünü kullanıyoruz.
        for (int i = 0; i < 3; i++) {
            Ogrenci ogrenci =new Ogrenci(); // new Ogrenci() ile for döngüsü devam ettiği sürece
                                            // İçinde veri olmayan 10 adet ogrenci nesnesi ürettik.
            ogrenciler[i]=ogrenci;  // üretilen bu nesneleri (öğrencileri ) öğrenciler dizininin elemanlarına atadır.
                                    // nesnelerin içerisinde hala veri yok .
                                    // bu aşamada dizi elemanlarına ogrenci diye boş bir nesne atanır
                                    // çıktısı alındığında null hatası alınacaktır.

            System.out.println("Ogrencinin İsmi :"); // döngü içerisinde scannerla daha önceden Ogrenci classında
            ogrenciler[i].isim = scan.nextLine();    // tanımlanan metotlarla  dizinin elemanlarına veri atanır.

            System.out.println("Ogrencinin Soyismi :");
            ogrenciler[i].soyisim= scan.nextLine();

            System.out.println("Ogrencinin Yaşı :");
            ogrenciler[i].yas= sc.nextInt();
        }
        /*System.out.println(ogrenciler[1].isim); */// Output : verilen isim çıkar.
        // System.out.println(ogrenciler[1]);  // Output : ram adresi gösterilir. içine veri girilmesine rağmen
                                               // belli bir methodla veri eklenmişsse o şekilde veri yazdırılmalı(çağrılmalı
        // System.out.println(Arrays.toString(ogrenciler)); // output : 3/10 eleman girilmiş girilen elemanlar ram adresi
                                                            // kalanlar null
        /*System.out.println(ogrenciler[2].soyisim); // verilen soyisim çıkar

        System.out.println(ogrenciler[0].yas); // verilen yaş çıkar.*/

        System.out.println("-Ad : "+ogrenciler[0].isim+" -Soyad : "+ogrenciler[0].soyisim+" -Yaş : "+ogrenciler[0].yas);
        System.out.println("-Ad : "+ogrenciler[1].isim+" -Soyad : "+ogrenciler[1].soyisim+" -Yaş : "+ogrenciler[1].yas);
        System.out.println("-Ad : "+ogrenciler[2].isim+" -Soyad : "+ogrenciler[2].soyisim+" -Yaş : "+ogrenciler[2].yas);

        for (int i = 0; i < 2; i++) {
            Ogrenci ogrenci = new Ogrenci();

            System.out.println("Ogrencinin İsmi :");
            ogrenci.isim = scan.nextLine();

            System.out.println("Ogrencinin Soyismi:");
            ogrenci.soyisim = scan.nextLine();

            ogrenciler[i] = ogrenci;   // ogrenci nesnesinin içine veri tanımlandıktan sonra dizinin elemanlarına atanır.
            System.out.println(ogrenciler[0].isim);

        }

    }
}
