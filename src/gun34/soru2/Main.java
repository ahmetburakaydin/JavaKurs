package gun34.soru2;

public class Main {
    public static void main(String[] args) {
        Isyeri d1 = new Isyeri("Dukkan");
        Isyeri d2 = new Isyeri("Magaza");

        Isci i1 = new Isci("Ahmet");
        Isci i2 = new Isci("Mehmet");
        Isci i3 = new Isci("Ali");
        Isci i4 = new Isci("Veli");

        i1.grupArkadasıSet(i2);
        i3.grupArkadasıSet(i4);

        d1.ekipCagır(i1);
        d1.ekipCagır(i3);

        System.out.println(d1);
        System.out.println(d2);
    }
}
