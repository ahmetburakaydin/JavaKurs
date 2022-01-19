package gun29TekrarSoyagacı.task1;

public class Main {
    public static void main(String[] args) {
        Insan aba= new Insan();
        aba.veriAta("ahmet burak aydın",31);
        Insan ea= new Insan();
        ea.veriAta("esra aydın",29);

        Insan ma= new Insan();
        ma.veriAta("murat aydın",69);
        Insan za= new Insan();
        za.veriAta("zeliha aydın",60);

        Insan gç= new Insan();
        gç.veriAta("güner çakır",64);
        Insan şç= new Insan();
        şç.veriAta("şengül çakır",57);

        aba.esAta(ea);
        ea.esAta(aba);
        aba.anneAta(za);
        aba.babaAta(ma);
        za.esAta(ma);
        ma.esAta(za);
        ea.anneAta(şç);
        ea.babaAta(gç);
        şç.esAta(gç);
        gç.esAta(şç);

        // çocuklar
        Insan asya = new Insan();
        asya.veriAta("asya betül aydın",3);
        aba.cocukAta(asya);

        Insan aö = new Insan();
        aö.veriAta("ayşe ölmez",37);
        Insan zaa = new Insan();
        zaa.veriAta("zeynep asarkaya",36);
        ma.cocukAta(aö,zaa,aba);
        za.cocukAta(aö,zaa,aba);

        Insan si = new Insan();
        si.veriAta("sümeyra inceleme",31);
        Insan mç = new Insan();
        mç.veriAta("mertcan çakır",23);
        gç.cocukAta(si,mç,ea);
        şç.cocukAta(si,mç,ea);





    }
}
