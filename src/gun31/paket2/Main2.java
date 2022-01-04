package gun31.paket2;

public class Main2 {
    public static void main(String[] args) {

        Boyut kenar = new Boyut();
        kenar.x=10;
        kenar.y=5;

        Dikdörtgen dikDörtGen = new Dikdörtgen();

        dikDörtGen.tanımla(kenar);
        double cevre= dikDörtGen.getCevre();
        System.out.println("Dikdörtgenin Cevresi :"+cevre);
        double alan = dikDörtGen.getAlan();
        System.out.println("Dikdörtgenin Alanı : "+alan);

    }
}
class Dikdörtgen{
    // ins var
    Boyut boyut;

    //methods
    public  void tanımla(Boyut boyut){
        this.boyut=boyut;
    }

    public double getCevre() {
        double cevre= (boyut.x+ boyut.y)*2;
        return cevre;
    }
    public double getAlan() {
        double alan= boyut.x* boyut.y;
        return alan;
    }

}
class Boyut{
    double x;
    double y;
}
