package gun34tekrar.soru2;

public class Main {
    public static void main(String[] args) {
        //        2 adet isyeri ve 4 adet isci olusturun
        //        iscilerin calisma arkadasini atayin,
        //        bir isciye is arkadasi atayinda diger iscinin de is arkadasi olarak da bu isci otomatik atanmali
        //        iscileri isyerlerine gönderin
        //        isyerlerinde kimlerin calistigini ekrana yazdiran methodu da yazmayi unutmayin

        Isyeri d1 = new Isyeri("Dukkan");
        Isyeri d2 = new Isyeri("Magaza");

        Isci i1 = new Isci("ahmet");
        Isci i2 = new Isci("mehmet");
        Isci i3 = new Isci("ali");
        Isci i4 = new Isci("veli");

        Grup g1 = new Grup(i1,i2);
        Grup g2 = new Grup(i3,i4);

        d1.grupAta(g1,g2);

        System.out.println(d1);

       /* i1.setGrup(i2);
        i3.setGrup(i4);

        d1.isciAta(i1,i3);*/




        System.out.println(d1);



    }
}
