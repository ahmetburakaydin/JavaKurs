package gun42.extend2;

public class Main {
    public static void main(String[] args) {


        Kamyon k1 = new Kamyon(Tür.Kamyon,"çöp",20);

        /*k1.tür=Tür.Kamyon;
        k1.model="Çöp";
        k1.yukKapasitesi=20;*/

        Otomobil o1 = new Otomobil(Tür.Otomobil,"Sedan","Audi");
        /*o1.tür=Tür.Otomobil;
        o1.marka="Audi";
        o1.model="Sedan";*/

        Ucak u1 = new Ucak(Tür.Ucak,"Yolcu",360);
        /*u1.yolcuKapasitesi=360;
        u1.tür=Tür.Ucak;
        u1.model="Yolcu";*/

        System.out.println(k1);
        System.out.println(o1);
        System.out.println(u1);


    }
}
