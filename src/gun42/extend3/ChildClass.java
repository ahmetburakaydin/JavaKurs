package gun42.extend3;

public class ChildClass  extends ParentClass   {
    static {
        System.out.println("ChildClass Static İnitializer");
    }
    {
        System.out.println("ChildClass instance initializer ");
    }
    public ChildClass() {
        System.out.println("ChildClass Constructor ");
    }
}
