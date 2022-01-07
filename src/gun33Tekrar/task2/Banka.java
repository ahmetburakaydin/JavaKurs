package gun33Tekrar.task2;

public class Banka {
    String id ;
    String subeAdı;
    int kasaBakiyesi;

    public Banka(String id, String subeAdı) {
        this.id = id;
        this.subeAdı = subeAdı;
    }

    public Banka(String id, String subeAdı, int kasaBakiyesi) {
        this(id,subeAdı);
        if(kasaBakiyesi>=0) {
            this.kasaBakiyesi = kasaBakiyesi;
        }
    }

    @Override
    public String toString() {
        return id+" Bankası "+subeAdı +" şubesi "+" mevcut Bakiye = "+kasaBakiyesi;
    }

    public void paraYatır(int yatırılacakPara){
        this.kasaBakiyesi+=yatırılacakPara;
    }
    public void paraCek(int cekilecekPara) {
        if(cekilecekPara<=kasaBakiyesi)
            this.kasaBakiyesi-=cekilecekPara;
    }

    public int getBakiye(){
        return kasaBakiyesi;
    }
}
