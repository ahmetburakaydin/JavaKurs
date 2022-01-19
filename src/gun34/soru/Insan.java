package gun34.soru;

public class Insan {
    String adi;
    int ayakkabiNo;

    Ayakkabı ayakkabi;

    boolean gezidemi=false;

    public Insan(String adi, int ayakkabiNo) {
        this.adi = adi;
        this.ayakkabiNo = ayakkabiNo;
    }
    public void ayakkabıGiy(Ayakkabı pabuc){
        if(ayakkabi!=null){
            System.out.println("Zaten ayakkabım var !");
        }else if(pabuc.numara!=ayakkabiNo){
            System.out.println("Bu ayakkabı numarası bana uygun değil");
        }
        else if (pabuc.mevsim!=Main.suAnKiMevsim){
            System.out.println("Bu ayakkabı mevsime uygun değil !");
        }
        else {
            ayakkabi=pabuc;
            System.out.println("Ayakkabıyı Giydim");
        }
    }
    public void ayakkabıyıCıkar(){
        if(ayakkabi==null){
            System.out.println("Zaten Ayağımda Ayakkabı Yok !");
        }
        else if (gezidemi){
            System.out.println("Dışardayım Çıkaramam");
        }
        else {
            this.ayakkabi=null;
            System.out.println("Ayakkabıyı Çıkardım");
        }
    }
    public void gez() {
        if (ayakkabi == null) System.out.println("Ayakkabım yok ki");
        else {
            System.out.println("tamam");
            gezidemi=true;
        }
    }
    public void geriGel(){
        if(gezidemi) {
            System.out.println("Tamam Eve Geldim");
            gezidemi=false;
        }
        else {
            System.out.println("Zaten Evdeyim");
        }
    }

    @Override
    public String toString() {
        return "Insan{" +
                "adi='" + adi + '\'' +
                ", ayakkabiNo=" + ayakkabiNo +
                ", ayakkabi=" + ayakkabi +
                '}';
    }
}
