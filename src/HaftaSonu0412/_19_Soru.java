package HaftaSonu0412;

public class _19_Soru {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {     // 5 satır sayılar 1 den başladığı için 1den 5 e kadar 5 dahil 5 adet satır başı boşluk
            System.out.print(" ");
            for (int j =5; j>i ; j--) { // 5den 1 e tersden boşluk
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i); // i nin değeri 1 son değeri 5

            }
            for (int j = 1; j <i ; j++) {
                System.out.print(i);

            }
            System.out.println();
        }



    }
}
