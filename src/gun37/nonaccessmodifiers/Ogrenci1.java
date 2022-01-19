package gun37.nonaccessmodifiers;

public class Ogrenci1 {
    String name;
    static int count;

    public static void main(String[] args) {
        Ogrenci1 o1 = new Ogrenci1("ahmet");
        Ogrenci1 o2 = new Ogrenci1("ahmet1");
        Ogrenci1 o3 = new Ogrenci1("ahmet2");
        Ogrenci1 o4 = new Ogrenci1("ahmet3");
        Ogrenci1 o5 = new Ogrenci1("ahmet4");

        System.out.println(o1.ogrenciSayısıStatic());
        System.out.println(o1.ogrenciSayısı());
    }

    int ogrenciSayısı() {  // nesnesin metodu  static olan ulaşabilir.
        return Ogrenci1.count;
    }
    static int ogrenciSayısıStatic (){
        return count; // Ogrenci1.count // aynı class içinde class ismi yazmaya gerek yok.
                      // staticlere class Ismi.degisken şeklinde oluşturulur.
    }

    public Ogrenci1(String name) {
        this.name = name;
        count++;
    }

}
