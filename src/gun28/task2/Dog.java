package gun28.task2;

public class Dog {
    //  instance variables; new ile oluşturulanlar
    String name ;
    String cins ;
    int yas;
    String sahibi ;




    // class variables,bir tanedir.nesnede oluşturulamazlar
    static int count;

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //  Dog clasından oluşturulmuş bir nesne.
       dog1.name="Hırıltı";
       dog1.cins="kuçu kuçu";
       dog1.sahibi="ahmet";
       dog1.yas=1;
        dog1.havla();

       Dog dog2 = new Dog();
        dog2.name="SuperMax";
        dog2.cins="lobrador";
        dog2.sahibi="mehmet";
        dog2.yas=4;
        dog2.havla();
        System.out.println("-------------");
        yaz(dog1.yas);
        yaz(dog2.sahibi);
        yaz(dog2);

    }
    // Dog türünden oluşturulan nesneye ait
    public void havla() {
        System.out.println("ben"+name+"havladım");
    }
    // bu class için oluşturulmuş bir metot
    public static void yaz(int i) {
        System.out.println(i);
    }
    public static void yaz(String str) {
        System.out.println(str);
    }
    public static void yaz(Dog dog) {
        System.out.println(dog.cins);
    }


}
