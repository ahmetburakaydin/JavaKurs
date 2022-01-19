package gun42.extend3;

public class Main {
    static {
        System.out.println("Main Static İnitializer");
    }
    public static void main(String[] args) {
        System.out.println("Main Başladı");
        ChildClass c1 = new ChildClass();
        System.out.println("Main Bitti" );
    }
}
