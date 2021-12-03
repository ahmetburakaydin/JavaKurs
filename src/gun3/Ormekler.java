package gun3;

public class Ormekler {
    public static void main(String[] args) {

        int haneSayisi = 300;
        int gidenSayisi = 50;
        int gelenSayisi = 110;

        int mevcut = haneSayisi+gelenSayisi-gidenSayisi;

        boolean sonuc = haneSayisi>mevcut;
        System.out.println("Sonuc "+ sonuc);
    }
}
