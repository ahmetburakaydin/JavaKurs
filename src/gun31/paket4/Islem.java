package gun31.paket4;

public class Islem {
    double val;

    public void set(double val) {
        this.val=val;
    }
    public void topla(double x){
        val+=x;
    }
    public void cıkar(double x) {
        val-=x;
    }
    public void yaz() {
        System.out.println("Sonuc = "+val);
    }

}
