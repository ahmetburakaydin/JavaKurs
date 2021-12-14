package gun20;

public class _01_MethodBelirsizSayıdaParametre {
    public static void main(String[] args) {
        // toplama metodu yazın. Ama kaç sayi olacağı bilinmiyor

        toplama(1,2,3,4,5,6,7);
        toplama(11,22,33,44);


    }
    public static void toplama(int...sayilar){

        //  int...sayilar => dizi mantığında çalışır.kaçtane verdiğimizin bir önemi yok
        // 2 ve 100 sayi içinde  aynı  işi yapar.
        int toplam = 0 ;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        System.out.println("toplam : "+toplam);
    }
}
