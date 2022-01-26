package gun47.ornek2;

public class ToyataPrius extends Vehicle implements IElectric,IGas{

    public ToyataPrius(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeBattery() {
        return "Tamam, Bataryayı Değiştiriyorum";
    }

    @Override
    public String changeOil() {
        return "Tamam , Değiştiriyorum";
    }

    @Override
    public String drive() {
        return "Tamam Sürüyorum.";
    }
}
