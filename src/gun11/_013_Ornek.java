package gun11;

import java.util.Scanner;

public class _013_Ornek {
    public static void main(String[] args) {
        //Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz.
        //Ortalama 60 dan büyük ise geçtiniz, değilse kaldınız şeklinde yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Vize ve Final Notlarınızı girin");
        int vizeNotu =scan.nextInt();
        int finalNotu = scan.nextInt();

        int ortalamaNot=(vizeNotu+finalNotu)/2;

        if (ortalamaNot>=60){
            System.out.println("Dersi Geçtiniz..");
        }
        else {
            System.out.println("Kaldınız ..");
        }
    }
}
