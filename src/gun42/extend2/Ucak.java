package gun42.extend2;

public class Ucak extends Arac{
    int yolcuKapasitesi;

    public Ucak(Tür tür, String model, int yolcuKapasitesi) {
        super(tür, model);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "tür=" + tür +
                ", model='" + model +
                ", yolcuKapasitesi=" + yolcuKapasitesi
                ;
    }
}
