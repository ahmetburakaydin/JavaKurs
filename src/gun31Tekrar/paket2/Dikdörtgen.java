package gun31Tekrar.paket2;

public class Dikdörtgen {
    Boyut boyut;

    public void tanımla (int x,int y){
        Boyut boyut = new Boyut();
        boyut.x=x;
        boyut.y=y;
        this.boyut=boyut;

    }

    public void tanımla ( Boyut boyut){
        this.boyut=boyut;
    }

    public double getCevre(){
        return 2*(boyut.x+ boyut.y);
    }
    public double getAlan(){
        return boyut.x* boyut.y;
    }

}
