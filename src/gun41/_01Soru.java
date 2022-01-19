package gun41;

import java.util.Scanner;

public class _01Soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        boolean hataVarmı=false;
        while(true){
            try{
                num = scan.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Sayı Girin");
                scan.nextLine();

            }

        }



    }
}
