package gun31Tekrar.paket1;

import javax.sound.midi.Soundbank;
import java.util.logging.SocketHandler;

public class Kitap {
    String adi;
    int basımYılı;
    int sayfaSayısı;
    static int kitapSayısı;

    public void kitapTanımla(String adi,int basımYılı,int sayfaSayısı){
        this.adi=adi;
        this.basımYılı=basımYılı;
        this.sayfaSayısı=sayfaSayısı;
        kitapSayısı++;
    }
    public void getKitapBilgisi(){
        System.out.println("Kitabın Adı : "+adi+"\nBasım Yılı : "+basımYılı+"\nSayfa Sayısı : "+sayfaSayısı);
        System.out.println("-------");
    }
    public static void kitapSayısıYaz() {
        System.out.println("Toplam Kitap Sayısı : "+kitapSayısı);
    }
}
