package gun33.task2;

public class Main {
    public static void main(String[] args) {
        Banka b1 = new Banka("kişisel", "A", 1000);
        Banka b2 = new Banka("şirket", "B");
        Banka b3 = new Banka("özel","c",2000);
        b2.paraYatır(250);

        Banka.transferEt(b3,b2,500);
        paraTransferEt(b1,b2,100);
        paraTransferEt(b3,b2,300);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

       /* Banka.transferEt(b1,b2,500);
        System.out.println(b1);
        System.out.println(b2);*/
    }
    public static void paraTransferEt (Banka from,Banka to ,int havaleMiktarı) {
        if(from.getBakiye()>havaleMiktarı){
            from.paraCek(havaleMiktarı);
            to.paraYatır(havaleMiktarı);
        }

    }





    /*
    Bir banka class'ı tanımlayınız. Veri kontrollerini ilgili yerlerde yapınız.
    1.    3 adet field ekleyiniz. (id, subeAdi, kasaBakiyesi)
    2.    initialize için 2 adet constructor kullanın.
    3.    paraYatir(); methodu ile bankaya para yatırın.
    4.    paraCek();    methodu ile bankaya para çekin.
    5.    Banka bilgilerini ekrana yazdıracak metodu oluşturun.
        (Şube : Xbank, bakiye : xxx.xx TL)(toString)
    6.    main'de 2 tane banka oluşturup para yatırma ve çekme işlemleri yapın
    7.    olusturdugunuz iki banka arasinda para transferi yapin. (Çözüm düşüneniz nedir)
     */

}

