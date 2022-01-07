package gun33.task2;

public class Banka {
    String id;
    String subeAdı;
    double kasaBakiyesi;


    public Banka(String id, String subeAdı) {
        this.id = id;
        this.subeAdı = subeAdı;
    }

    public Banka(String id, String subeAdı, int kasaBakiyesi) {
        this(id,subeAdı);
        if(kasaBakiyesi>=0)
            this.kasaBakiyesi = kasaBakiyesi;

    }

    @Override
    public String toString() {
        return "Banka : " +
                subeAdı +
                ", kasaBakiyesi= " + kasaBakiyesi
               ;
    }

    public void paraYatır(int miktar){
        if(miktar>0){
            kasaBakiyesi+=miktar;
        }
    }

    public void paraCek(int miktar){
        if(kasaBakiyesi>=miktar){
            kasaBakiyesi-=miktar;
        }

    }

    public double getBakiye(){
        return kasaBakiyesi;
    }

    public static void transferEt (Banka b1,Banka b2,int transfer) {

        b1.paraCek(transfer);
        b2.paraYatır(transfer);

    }


}
