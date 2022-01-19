package gun34tekrar.soru1;

public class Insan {
    String adi;
    int ayakkabıNo;
    Ayakkabı ayakkabi;
    boolean disardami =false;

    public Insan(String adi, int ayakkabıNo) {
        this.adi = adi;
        this.ayakkabıNo = ayakkabıNo;
    }

    public void ayakkabıGiy(Ayakkabı ayakkabı){
        if(this.ayakkabi !=null) {
            System.out.println("Zaten Ayakkabım Var !!!");
        }
        else if(ayakkabı.mevsim!=Main.suAnKiMevsim){
            System.out.println("Ayakkabı Mevsime Uygun Değil !!!");
        }
        else if(ayakkabı.numara!=this.ayakkabıNo){
            System.out.println("Ayakkabı Numarası Uygun Değil");
        }else {
            this.ayakkabi =ayakkabı;
            System.out.println("Ayakkabıyı Giydim");
        }



    }
    public void ayakkabiCikar(){
        if(this.ayakkabi ==null) System.out.println("Ayakkabım Yokki Nasıl Çıkarayım !");
        else if(disardami) System.out.println("Dışarıdayım Çıkaramam ki !");
        else {
            this.ayakkabi =null;
            System.out.println("Ayakkabıyı çıkardım");
        }

    }
    public void gez(){
        if(this.ayakkabi==null) System.out.println("Ayakkabım yok ki Nasıl Gezeyim");
        else if(disardami) System.out.println("Zaten Dışardayım !");
        else {
            disardami=true;
            System.out.println("Tamam Gezmeye Gidiyorum.");
        }
    }
    public void geriGel(){
        if(disardami==false) {
            System.out.println("Dışarıda Değilim Nasıl Geri Geleyim !");
        }else {
            disardami=false;
            System.out.println("Tamam Eve Geliyorum.");
        }
    }

    @Override
    public String toString() {
        return  adi;
    }
}
