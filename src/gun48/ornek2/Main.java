package gun48.ornek2;

public class Main {
    public static void main(String[] args) {
        IsMakinasi arac1= new IsMakinasi("Volvo");
        IsMakinasi arac2=new IsMakinasi("Cat");

        Insan i1 = new Insan("Ahmet",true);
        Insan i2 = new Insan("Mehmet",true);
        Insan i3 = new Insan("Ali",false);

        i1.aracaBin(arac1);
        i1.aractanIn();
        i1.aracaBin(arac2);
        /*i3.aracaBin(arac2);
        i2.aracaBin(arac1);
        i3.sur();
        i3.aractanIn();
        i2.aracaBin(arac2);

        System.out.println(arac1.soforu());*/

    }
}
