package gun31Tekrar.paket2;

public class Main2 {
    public static void main(String[] args) {
        /*
            Bir dikdörtgenin alanini hesaplayalim
             Boyut class
                double x;
                double y;
            Dikdörtgen class
                //ins var
                Boyut boyut;
                //methods
                void tanimla(int x, int y);
                void tanimla(Boyut boyut);
                double getCevre();
                double getAlan();
             Main2
                Dikdörtgen tanimlanip alani ve cevresi hesaplanacak
         */

        Dikdörtgen d1 = new Dikdörtgen();
        Boyut boyut2=new Boyut();
        boyut2.x=5;
        boyut2.y=4;
        d1.tanımla(boyut2);

        /*d1.tanımla(5,6);*/
        System.out.println("Dikdörtgenin Çevresi : "+d1.getCevre());
        System.out.println("Dikdörtgenin Alanı : "+d1.getAlan());

    }
}
