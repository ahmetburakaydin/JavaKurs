package gun13;

import java.util.Scanner;

public class _09_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num ;
        String strNum;
        do {
            System.out.println("bir sayi girin"); // girilen sayının içerisinde 0 sıfır olan sayılar
            num=scan.nextInt();
            strNum =String.valueOf(num);
        }while (!strNum.contains("0"));


    }
}
