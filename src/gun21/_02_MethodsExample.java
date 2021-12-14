package gun21;

public class _02_MethodsExample {
    public static void main(String[] args) {
        faktoriyelHesapla(5);
        faktoriyelHesapla(12);
        faktoriyelHesapla(15);
    }

    public static void faktoriyelHesapla(int a) {

        double faktoriyel = 1;
        for (int i = 1; i <= a; i++) {
            faktoriyel *= i;
        }
        System.out.println("Sayının Faktöriyeli : " + faktoriyel);

    }
}