package gun5;

public class StringMetotlar1 {
    public static void main(String[] args) {
        String cumle1="yarın hafta sonu tatili geldi";
        int cumleBaslangıc=cumle1.indexOf("g");
        int cumleSonu=cumle1.length();
        System.out.println(cumle1.substring(cumleBaslangıc,cumleSonu));
    }
}
