package gun4;

public class Ornekler {
    public static void main(String[] args) {
        int aylikGelir  =6000;
        int evKirasi = 1000;
        int ikramiye = 6000;
        int tatil = 2000;
        int marketKiyafet = 1000;

        int eldeKalan = aylikGelir+ikramiye-evKirasi-tatil-marketKiyafet;

        System.out.println("Elde toplam "+eldeKalan+" tl kalmıştır.");
    }
}
