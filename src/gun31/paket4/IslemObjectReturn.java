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
    public IslemObjectReturn carp(double x) {
        val*=x;
        return this;
    }
    public IslemObjectReturn böl(double x) {
        if(x!=0){
            val/=x;
        }
        else{
            System.out.println("Girilen Sayı Tanımsız");
        }
        return this;
    }
    public IslemObjectReturn modunuAl(double x) {
        val%=x;
        return this;
    }
    public IslemObjectReturn kareKökünüAl(double x) {
        val=Math.sqrt(x);
        return this;
    }
    public IslemObjectReturn convertToInt() {
        Math.floor(val);
        Math.ceil(val);
        Math.round(val);
        return this;
    }

    public void yaz() {
        System.out.println("Sonuc = "+val);
    }

    /*
        Ödev
        Bu class"a
        carpma, bolme, mod, power, karekök,
        convertToInt,
        MyMath.floor, MyMath.ceil, MyMath.round
     */


}
