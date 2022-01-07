package gun31Tekrar.paket3;

public class Dikdörtgen {
    double x;
    double y;

    public static Dikdörtgen getDikdortgen(double x, double y) {
        Dikdörtgen d = new Dikdörtgen();
        d.tanımla(x,y);
        return d;
    }
    public void tanımla (double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getCevre(){

        return 2*(x+y);
    }
    public double getAlan(){

            return x* y;
    }

}
