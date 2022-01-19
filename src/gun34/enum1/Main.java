package gun34.enum1;

public class Main {
    public static void main(String[] args) {
        String ay1="Ocak";
        Aylar ay12=Aylar.ARALIK;

        System.out.println(ay1);
        System.out.println(ay12);
        ay12=Aylar.AGUSTOS;
        System.out.println(ay12);

        switch (ay12){
            case ARALIK :
                System.out.println("Aralık Ayındayız");
                break;
            case KASIM :
                System.out.println("Kasım Ayındayız");
                break;
        }
    }
}
