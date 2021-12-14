package gun20;

public class _01_MethodsReturnType {
    public static void main(String[] args) {
        // iki sayinin toplamını bulan metot yazın.
        toplam(1,5);
        toplamReturn(1,5);
    }
    public static void toplam(int sayi1 , int sayi2){
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);

    }
    public static int toplamReturn(int sayi1,int sayi2) {
        int toplam = sayi1+sayi2;
        return toplam;
    }


}
