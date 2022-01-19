package gun39.TryCatch1;

import java.util.Scanner;

public class TryCatch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı girin");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            System.out.println(num1/num2);

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
