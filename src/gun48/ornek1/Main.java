package gun48.ornek1;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan("Ahmet");
        Insan i2 = new Insan("Mehmet");
        Insan i3 = new Insan("Ali");
        Insan i4 = new Insan("Veli");
        Insan i5 = new Insan("Ayse");

        i1.arkadasAta(i2,i3);
        i4.arkadasAta(i5);

        i1.sohbetEt(i2);
        i1.sohbetEt(i4);
        i3.sohbetEt(i4);
        i5.sohbetEt(i4);


    }
}
