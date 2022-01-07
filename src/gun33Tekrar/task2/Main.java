package gun33Tekrar.task2;

public class Main {
    public static void main(String[] args) {
     /*
    Bir banka class'ı tanımlayınız. Veri kontrollerini ilgili yerlerde yapınız.
    1.	3 adet field ekleyiniz. (id, subeAdi, kasaBakiyesi)
    2.	initialize için 2 adet constructor kullanın.
	3.	paraYatir(int yatirilacakPara); methodu ile bankaya para yatırın.
	4.	paraCek();	methodu ile bankaya para çekin.
	    getBakiye()
    5.	Banka bilgilerini ekrana yazdıracak metodu oluşturun.
        (Şube : Xbank, bakiye : xxx.xx TL)(toString)
	6.	main'de 2 tane banka oluşturup para yatırma ve çekme işlemleri yapın
	7.	olusturdugunuz iki banka arasinda para transferi yapin. (Çözüm düşüneniz nedir)
     */
        Banka b1 = new Banka("A","Istanbul",5000);
        Banka b2 = new Banka("B","Ankara",3000);
        Banka b3 = new Banka("C","İzmir");

        b1.paraCek(500);
        System.out.println(b1);
        b2.paraYatır(500);
        System.out.println(b2);
        transferEt(b1,b2,1500);

    }
    public static void transferEt(Banka from, Banka to , int transfer) {

        if(transfer<=from.kasaBakiyesi){
            from.paraCek(transfer);
        }
        to.paraYatır(transfer);
        System.out.println("**********");
        System.out.println(from.id+" Bankasından "+to.id+" Bankasına "+transfer+" Transfer Ediliyor.");
        System.out.println("**********");
        System.out.println(from);
        System.out.println(to);

    }

}
