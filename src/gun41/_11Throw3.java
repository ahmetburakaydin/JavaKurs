package gun41;

import java.io.IOException;
import java.util.Scanner;

public class _11Throw3 {
    public static void main(String[] args) throws Exception {
        //girilen sayı çift ise
        // 3e bölünebililyosa
        // 2 farklı hata throw edip yakalalıyn

        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                int sayi = scan.nextInt();
                if(sayi%2==0)
                    throw new ArithmeticException("Çift Sayı Hatası");
                if(sayi%3==0)
                    throw new IOException("3'e Bölünen Sayı Hatası");
                System.out.println("Sayının Karesi :"+Math.pow(sayi,2));
                System.out.println("Sayının Karekökü :"+Math.sqrt(sayi));
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage()+", olmamalı");
                scan.nextLine();
            }catch (IOException e){
                System.out.println(e.getMessage()+", bu hiç olmadı");
                scan.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage()+", hele bu hiç olmadı ");
                scan.nextLine();
            }
        }
    }
}
