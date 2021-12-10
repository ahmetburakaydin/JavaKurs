package gun19;

public class _01_Methods {
    public static void main(String[] args) {
        int sayi1= 3;
        int sayi2= 5;
        findEnb(sayi1,sayi2);
        findEnb(3,5);

    }
    public static void findEnb(int a ,int b){
        /*
        int a ve int b ye parametre denir.Methodun  kullanıldığı yerde içine verilen değerledir.
        Parametre vermenin bir sınırı  yoktur.Parametreler aynı tipte olmak zorunda değildir.
        Parametre isimleri ile dışardan verilen değerlerin isimlerinin aynı olmak zorunda değildir.
         */
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
