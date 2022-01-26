package gun44.polimorphism1;

public class Calısan extends Insan{
    double maas;

    public Calısan(String adi, double maas) {
        super(adi);
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Calısan{" +
                "maas=" + maas +
                ", adi='" + adi + '\'' +
                '}';
    }
}
