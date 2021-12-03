package gun14;

import java.util.Scanner;

public class _02_Continue {
    /* kullanıcıdan 5 tane tam sayı  girmesini isteyin.
       bu sayılardan  5 ile 10 arasındakiler hariç , diğerlerinin toplamını bulun.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        for(int i =0;i<5;i++){
            System.out.println("Bir tam sayı girin.");
            int num = scanner.nextInt();
            if (num>5 && num <10){
                continue;
            }
            toplam+=num;

        }
        System.out.println("toplam : "+toplam);
    }
}
