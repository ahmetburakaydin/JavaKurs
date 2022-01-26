package gun46.abstract1;

public abstract class AbstractClass {
    // methodlardan en az biri abstract olan classlar abstrac class olarak tanımlanmalı
    // abstractclasslarda nesne oluşturulmazlar
    // abstractclassları extend eden classlar bu classa ait abstract methodu override etmeli

    // gövdesiz method tanımlanacaksa abstract ifadesi kullanılmalı
    abstract void  abstractmethod();
    // normal methodlarda bulunabilir
    public void say(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(i+",");
        }
    }
}
