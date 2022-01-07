package gun32.paket.constructor;

public class Student {
    int id;
    int number;
    String name;
    String surname;
    int classroom;

    // class ismiyle aynı olan ve returnu olmayan özel  methodlardır.
    // nesne oluşturulduğunda otomatik çalışır.
    // constructor edilmesede java boş bir constructor create eder ve çalıştırır. out dosyalarından bakılabilir.
    // amaç nesne oluşturulduğunda  çalıştırılmak istenen  yada initialize için kullanılır.
    public Student(int id ,int number,String name,String surname , int classroom){
        System.out.println("constructor çalıştı");
        this.id=id;
        this.number=number;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;
    }
    public Student(){

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setStudent(int id , int number, String name, String surname , int classroom) {
        this.id=id;
        this.number=number;
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;

    }

    @Override
    public String toString() {
        return "Öğrenci Bilgisi{" +
                "id=" + id +
                "\nnumber=" + number +
                "\nname=" + name +
                "\nsurname=" + surname +
                "\nclassroom=" + classroom +
                '}';
    }
}
