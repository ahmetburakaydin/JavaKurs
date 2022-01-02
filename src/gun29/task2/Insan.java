package gun29.task2;

import java.util.ArrayList;

public class Insan {
    static int count;
    String adı;
    int yaşı;
    ArrayList<String>akrabaları =new ArrayList<>();
    // ArrayList olarak tanımlanan bir instance variables eğer sadece değişken virgül şekilde bırakılsaydi,
    // ramde açılmış yeni bir arraylist olmadığından veri atansa bile , atanacak bir yer olmadığından hata verecekti.
    // farklı konumlarda bu tanımlama yapılabileceği  gibi classın başında ve ya kullanılacak methodların içinde tanımlanabilirdi.
    public void adınıSoyle(){
        System.out.println(adı);
    }
    public void veriAta(String adi,int yaşı) {  // genelde javada yukardaki değişkenler ve methodun parametreleri aynı yazılır.
        this.adı=adi;                           // bu durumda classın değişkenin belirtmek için başına this eklenir.
        this.yaşı=yaşı;
        count++;


    }
    public void akrabaAta (String... adi) {  // Bu kullanımda 'adi' ifadesi aşağıda Array olarak tanımlanır.
        for (String s:adi) {   // foreach methoduyla istenildiği kadar girilebilecek string ifadelerin sırayla bir tanesini alarak
            akrabaları.add(s); // instance variables da tanımlanan ArraysListe eklenir.(new Arraylist() oluşturulduktan sonra )

        }
    }
    public void akrabalarınıSoyle(){   // var args // Variable Arguments. // Array olarak algılanır.
        System.out.println(akrabaları);
    }
    public static void insanSayısı () {
        System.out.println("insan sayısı : "+count);
    }



}
