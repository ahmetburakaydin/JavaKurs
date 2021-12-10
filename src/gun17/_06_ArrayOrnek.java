package gun17;

import java.util.Scanner;

public class _06_ArrayOrnek {
    public static void main(String[] args) {
        // kullanıcıdan 5 tane sayı alın ve bu sayıların tek olanlarının toplam sayısını ve tek sayıları yazdırın.
        Scanner scan = new Scanner(System.in);
        int [] array =new int[5];
        for (int i = 0; i < array.length ; i++) {   // dizi eleman eklemek için
            System.out.println("Bir Sayı Girin");
            array[i]=scan.nextInt();
        }
        int miktar=0;
        for (int i = 0; i <5 ; i++) {  // dizideki elemanları kontrol etmek için
            if(array[i] % 2 ==1){
                System.out.println(array[i]+" ");
                miktar++;
            }
            
        }
        System.out.println("miktar =" + miktar);






    }
}
