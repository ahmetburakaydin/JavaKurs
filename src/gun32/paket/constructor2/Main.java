package gun32.paket.constructor2;

public class Main {
    public static void main(String[] args) {
        Sirket s1 = new Sirket("Koc","Holding");
        System.out.println(s1);

        Sirket s2 =new Sirket("Sabancı","Holding","ÇengelKöy");
        System.out.println(s2);

        Sirket s3=new Sirket("Enka","Holding","Sarıyer",489754741);
        System.out.println(s3);
    }
}
