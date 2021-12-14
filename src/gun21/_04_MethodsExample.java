package gun21;

import java.util.Scanner;

public class _04_MethodsExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifre Girin : ");
        String sifre= scan.nextLine();

        sifreKontrol(sifre);
}
    public static void sifreKontrol (String password) {
        if(!(password.length() >=8 && password.length()<=12) && password.contains("pass"))   {
            System.out.println("ŞİFRE UYGUN DEĞİL.");
        }
        else{
            System.out.println("ŞİFRE TANIMLAMA BAŞARILI");
        }

    }
}
