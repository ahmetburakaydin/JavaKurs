package gun38.enum3;

public class Main {
    public static void main(String[] args) {
        Kitap k1=Kitap.SEFILLER;


        System.out.println(k1);
        System.out.println(k1.ordinal());
        System.out.println(k1.name());
        System.out.println(k1.getSayfaSayısı());
        System.out.println(k1.getYazari());
    }
}
