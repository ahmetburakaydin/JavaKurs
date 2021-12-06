package HaftaSonu0412;

public class _09_Soru {
    public static void main(String[] args) {
        //1 ile 500 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın.
        //Sayının her basamağının küplerinin toplamı sayının kendisine eşitse bu sayıya Armstrong
        //sayısı denir.Örneğin, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        int yüzler,onlar,birler,toplam;
        System.out.println("Armstrong Sayılar");

        for (int i = 1; i <= 500; i++) {
            yüzler=(i/100);
            onlar=(i%100)/10;
            birler=i%10;
            toplam =(int)((Math.pow(yüzler,3)+Math.pow(onlar,3)+Math.pow(birler,3)));

            if(i==toplam){
                System.out.println(i);
            }

        }
    }
}
