package gun47.ornek2;

public interface IVehicle {
    String drive();
    default void defaultMethod(){
        System.out.println("Interface default method");
    }
    static void autoPilot(){
        System.out.println("Interface static  method");
    }
}
