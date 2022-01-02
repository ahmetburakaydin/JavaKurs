package gun29.task3;

public class Main {
    public static void main(String[] args) {
        Insan i1= new Insan();
        i1.veriAta("ahmet",32);

         Insan i2=new Insan();
        i2.veriAta("Semih",50);

        Insan i3=new Insan();
       i3.veriAta("Elif",48);

       i1.babaAta(i2);
       i1.anneAta(i3);

       i1.baba.adı = "semih2";
       i1.baba.yas =61;

       /*i1.senKimsin();
       i1.babaAdınNe();
       i1.anneAdınNe();

       i2.anneAdınNe();*/

       i1.cocukAta(i2,i3);
       i1.cocuklarınıSoyle();




    }
}
