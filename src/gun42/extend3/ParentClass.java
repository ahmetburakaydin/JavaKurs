package gun42.extend3;

public class ParentClass {
    static {
        System.out.println("ParentClass Static ─░nitializer");
    }
    {
        System.out.println("ParentClass instance initializer ");
    }
    public ParentClass() {
        System.out.println("ParentClass Constructor ");
    }

}
