package gun47.ornek2;

public class Bus extends Vehicle implements IDiesel{

    public Bus(Model model, int modelYili) {
        super(model, modelYili);
    }

    @Override
    public String changeDiesel() {
        return "Tamam Yakıtı Değiştiriyorum";
    }

    @Override
    public String drive() {
        return "Tamam Sürüyorum";
    }
}
