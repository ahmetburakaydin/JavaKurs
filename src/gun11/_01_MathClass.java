package gun11;

public class _01_MathClass {
    public static void main(String[] args) {

        int sayi1=-15;
        int sayi2=4;

        System.out.println("sayi1in mutlak değeri : "+Math.abs(sayi1));
        System.out.println("sayi1 ve sayi2den büyük olanı : "+Math.max(sayi1,sayi2));
        System.out.println("sayi1 ve sayi2den küçük olanı : "+Math.min(sayi1,sayi2));
        System.out.println("sayi2nin karekökü"+Math.sqrt(sayi2));

        System.out.println("2,4,8 arasında en büyük olanı : "+Math.max(2,Math.max(4,8)));
        System.out.println("2nin 3üncü kuvveti : "+Math.pow(2,3));




    }
}
