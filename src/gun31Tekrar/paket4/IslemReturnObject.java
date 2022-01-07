package gun31Tekrar.paket4;

public class IslemReturnObject {
    double val;

    public IslemReturnObject set(double val){
        this.val =val;
        return this;
    }
    public IslemReturnObject topla(double x){
        val+=x;
        return this;
    }
    public IslemReturnObject cıkar(double x){
        val-=x;
        return this;
    }
    public void yaz(){

        System.out.println("sonuc = "+val);
    }
}
