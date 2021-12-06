package ahmethoca0412;

public class _02_Tekrar {
    public static void main(String[] args) {
        // 1 ile 100 arasindaki sayilardan 3'e bölünenin sayi yerine FIZZ,
        // 5'e bölünen yerine BAZZ, 15'e bölünen yerine FIZZBASS,
        // diger sayilar oldugu gibi yazilacak

        int sayi = 1;
        for (int i = 1; i <= 100; i++) {
            if (sayi % 15 == 0) {  // Mod 15 i sonrasında yazdığımızda mod 15 için tanımlacak sayılar mod15 satırına
                System.out.println("FIZZBAZZ");  // gelmeden önce mod3 ve mod5 satırında tanımlanacağı için
            } else if (sayi % 3 == 0) {          // FIZZBAZZ yazmıyor.
                System.out.println("FIZZ");
            } else if (sayi % 15 == 0) {
                System.out.println("BAZZ");
            } else {
                System.out.println(sayi);
            }
            sayi++;
        }



    }
}