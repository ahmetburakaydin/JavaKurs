package gun29.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan();
        Insan i2 = new Insan();

        /*i1.adı="Ahmet";
        i1.yaşı=18; */
        /*i1.akrabaları=new ArrayList<>();
        i2.akrabaları=new ArrayList<>();*/
        /*
        i2.adı="Ahmet";
        i2.yaşı=18;
        i2.akrabalar=new ArrayList<>();*/

        i1.veriAta("Ali",25);  // bir kişinin adını ve yaşını ekleyip miktarı 1 artırma işlemi yapıyor.
        /*Insan.count++;*/ // veriAtta metodunun içerisinde belirtilmeseydi başka bir class içinde bu şekilde ifade edilirdi.
        i1.akrabaAta("mehmet","murat","muhammed"); // i1 nesnesine istenildiği kadar String ifade ekleniyor.(ArrayList oluşturuluyor)
        i1.adınıSoyle(); // i1 nesnesine atanan ismi yazdırıyor.
        i1.akrabalarınıSoyle(); // oluşturulan ArrayList yazdırılıyor.
        System.out.println("------------------");
        i2.veriAta("Aras",32);
        i2.akrabaAta("asya","aslı","ayla");
        i2.adınıSoyle();
        i2.akrabalarınıSoyle();


        Insan.insanSayısı(); //  Insan classında oluşturulmuş static bir method başka bir classda , ait olduğu class ismiyle çağrılır.


    }
}
