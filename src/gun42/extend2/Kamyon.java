package gun42.extend2;

public class Kamyon extends Arac {
    double yukKapasitesi;


    public Kamyon(Tür tür, String model, double yukKapasitesi) {
        super(tür, model);
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    public String toString() {
        return
                "tür=" + tür +
                ", model=" + model +
                ", yukKapasitesi=" + yukKapasitesi
                ;
    }
}
