package gun42.extend2;

public class Arac {
    Tür tür;
    String model;



    public Arac(Tür tür, String model) {
        this.tür = tür;
        this.model = model;
    }

    @Override
    public String toString() {
        return "tür=" + tür +
                ", model='" + model
                ;
    }
}
