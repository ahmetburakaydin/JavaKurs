package HaftaSonu0412;


import java.util.Scanner;

public class _010_Soru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kelime;
        int sayi;
        int toplam =0;
        do {
            for (int i = 0; i < 2; i++) {
                System.out.println("sayi girin");
                sayi = scanner.nextInt();
                toplam+=sayi;
            }
            System.out.println("toplam =" + toplam);
            System.out.println("devam etmek istiyor musunuz? -- 'y' or 'n'");
            scanner.nextLine();
            kelime = scanner.nextLine();
        } while (kelime.equalsIgnoreCase("y"));
        if (!kelime.equalsIgnoreCase("y")){
            System.out.println("program sonlandı");
        }
    }
}
