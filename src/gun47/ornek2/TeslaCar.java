package gun47.ornek2;

public class TeslaCar extends Vehicle implements IElectric{


    public TeslaCar(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeBattery() {
        return "Tamam Değiştiriyorum";
    }

    @Override
    public String drive() {
        return "Tamam Sürüyorum";
    }
}
