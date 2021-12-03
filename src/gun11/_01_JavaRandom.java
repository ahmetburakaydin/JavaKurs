package gun11;

public class _01_JavaRandom {
    public static void main(String[] args) {
        double randomSayı1 = Math.random();
        System.out.println(randomSayı1);
        // 0-1 arasında rastgele bir sayi üretir.1 dahil değildir.

        int randomSayi2 = (int) (Math.random()*10);
        System.out.println(randomSayi2);

        // 0-10 arasında  rastgele bir tam sayı oluştur.10 dahil değil.

        int min = 3;
        int max = 5;
        int randomSayi3=(int) (Math.random()*((max-min)+1))+min;
        System.out.println(randomSayi3);
        // maximum ve minimum sayılar verip o aralıkta random sayı oluşturmak için kullanılır.
        // min -> 0*(....)+min => 3
        // max -> (0,99*(5))+min => 7

    }
}




