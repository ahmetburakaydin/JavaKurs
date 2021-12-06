package HaftaSonu0412;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        /*     Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın. Ardından, sayının asal
                sayı olup olmadığını belirten bir mesaj çıkarmalıdır.
                Asal sayı, yalnızca 1 ve kendisine bölünebilen pozitif sayılardır.
                Input: -2 Output: false Input: 5 Output: true
                Input: 2 Output: true Input: 10 Output: false

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("pozitif bir tam sayı girin");
        int sayi = scan.nextInt();
        int bölenSayacı=0;

        for (int i =2;i<sayi;i++){  // sayi 2 girince i<sayidan olmadığından for döngüsü çalışmıyor
            if (sayi%i==0){         // direk if satırına geçiyor bölensayacı artmadığından 2yi Asal Sayı olarak ifade ediyor.
                bölenSayacı++;      // 2 için ekstra if blogu içerisinde satır yazmaya gerek kalmıyor.
            }
        }if (bölenSayacı==0){
            System.out.println(sayi+" ASAL SAYIDIR");

        }else{
            System.out.println(sayi+" ASAL SAYI DEĞİLDİR");
        }
    }
}


