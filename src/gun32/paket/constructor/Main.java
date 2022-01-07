package gun32.paket.constructor;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(054,29,"Ahmet","Aydın",12);
        System.out.println(s1);
        System.out.println("-----------------");
        Student s2 = new Student("Ahmet","Aydın");
        System.out.println(s2);
    }
}
