package gun47.ornek2;

public class Main {
    public static void main(String[] args) {
        Vehicle teslaCar = new TeslaCar(Model.TESLA101,2020);
        Vehicle toyataPrius =new ToyataPrius(Model.TOYOTAPRIUS30,2019);
        Vehicle bus = new Bus(Model.BUS403,2010);

        Utils.writeKnowledges(teslaCar);

        System.out.println(((TeslaCar) teslaCar).drive());
        System.out.println(((ToyataPrius) toyataPrius).drive());
        System.out.println(((Bus) bus).drive());

        



    }
}
