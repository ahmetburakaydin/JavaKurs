package HaftaSonu0412;

public class _18_Soru {
    public static void main(String[] args) {

        for (int i =1; i<=5; i++) { // 5 satır
            System.out.print(" ");
            for (int j =5; j>i ; j--){  // her satıra en az 5 den 1 e boşluk
                System.out.print(" ");
            }
            for (int j = 0; j<i ; j++) { //
                System.out.print("*");
            }

            for (int j=1; j<i; j++) {
                System.out.print("*");
            }




            System.out.println();
        }
        
    }
}
