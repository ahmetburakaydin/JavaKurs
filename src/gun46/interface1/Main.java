package gun46.interface1;

public class Main {
    public static void main(String[] args) {
        Sekil sekil =new Sekil();
        Sekil1 sekil1=new Sekil1();
        ICizilebilir s = new Sekil();

        sekil.ciz();
        sekil1.ciz();
        s.ciz();
    }
}
