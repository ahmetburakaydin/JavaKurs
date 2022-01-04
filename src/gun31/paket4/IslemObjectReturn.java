package gun31.paket4;

public class IslemObjectReturn {
    double val;

    public IslemObjectReturn set(double val) {
        this.val=val;
        return this;
    }
    public IslemObjectReturn topla(double x){
        val+=x;
        return this;
    }
    public IslemObjectReturn cıkar(double x) {
        val-=x;
        return this;
    }
    public void yaz() {
        System.out.println("Sonuc = "+val);
    }

}
