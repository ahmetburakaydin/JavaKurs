package gun11;

public class _04_Ornekler {
    public static void main(String[] args) {
        String str1 = "Her gelen baktı geçti";

        char ilkHarf=str1.charAt(0);
        char sonHarf=str1.charAt(str1.length()-1);
        char ortaHarf= str1.charAt(str1.length()/2);
        int str1Uzunluk=str1.length();

        System.out.println(ilkHarf+sonHarf+ortaHarf+str1Uzunluk);
    }
}
