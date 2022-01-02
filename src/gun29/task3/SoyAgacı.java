package gun29.task3;

public class SoyAgacı {
    public static void main(String[] args) {
        Insan i1 = new Insan();
        Insan i2 = new Insan();

        i1.veriAta("Ahmet Burak",32);
        i2.veriAta("Esra",30);

        Insan b1 = new Insan();
        Insan a1 = new Insan();
        b1.veriAta("Murat",69);
        a1.veriAta("Zeliha",62);
        i1.babaAta(b1);
        i1.anneAta(a1);

        Insan b2 = new Insan();
        Insan a2 = new Insan();
        b2.veriAta("Güner ",64);
        a2.veriAta("Şengül",56);
        i2.babaAta(b2);
        i2.anneAta(a2);

        Insan c11 = new Insan();
        Insan c12 = new Insan();
        Insan c13 = new Insan();

        c11.veriAta("Ayşe",36);
        c12.veriAta("Zeynep",35);
        c13.veriAta(i1.adı,i1.yas);
        c13.cocukAta(b1);
        c13.cocukAta(a1);
        c11.cocukAta(b1);
        c11.cocukAta(a1);
        c12.cocukAta(b1);
        c12.cocukAta(a1);

        Insan c21 = new Insan();
        Insan c22 = new Insan();
        Insan c23 = new Insan();

        c21.veriAta("Sümeyra",32);
        c22.veriAta(i2.adı, i2.yas);
        c23.veriAta("Mertcan",23);

        c21.cocukAta(b2);
        c21.cocukAta(a2);
        c22.cocukAta(b2);
        c22.cocukAta(a2);
        c23.cocukAta(b2);
        c23.cocukAta(a2);


    }

}
