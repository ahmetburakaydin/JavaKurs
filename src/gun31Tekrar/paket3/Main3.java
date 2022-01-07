package gun31Tekrar.paket3;

public class Main3 {
    public static void main(String[] args) {
        // Dikdörtgenini alanini ve cevresini hesaplayacagiz
        // ama burada new kullanilmayacak

        Dikdörtgen d1=Dikdörtgen.getDikdortgen(4,3);
        System.out.println("Dikdörtgenin alanı : "+ d1.getAlan());
        System.out.println("Dikdörtgenin Çevresi : "+ d1.getCevre());

    }
}
