package gun28.task4;

import gun28.task2.Dog;

public class Main {
    public static void çiz (String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Java j1 = new Java();

        j1.name = "Lewis";
        j1.havla();
        j1.yas = 21;
        j1.cins="Labrador";
        j1.ısır();
        Java.sayi=5; // static olmayan bir variablesi başka bir clasda yine  class ismiyle çağırıyoruz.
        // static bir method
        Main.çiz(j1.name); // Main classında tanımlanan bir method
        // yine aynı classda kullanılacaksa class ismine gerek yok
        Java.kes();        // başka bir classda tanımlanmış static bir method
        Java.yaz(j1.yas);   // başka bir class kullanılırken class ismi başa yazılarak çağrılır.
        Dog.yaz(j1.yas);

    }
}
class Java {
    String name ;
    String cins;
    int yas;
    static int sayi;
    public void havla() {
        System.out.println("ben"+name+"havladım");
    }
    public void ısır() {System.out.println("ben"+name+"havladım");}
    public static void yaz(int i) {
        System.out.println(i);
    }
    public static void kes() { System.out.println("Yazıyorum");}



}
