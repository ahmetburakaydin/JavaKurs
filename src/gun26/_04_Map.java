package gun26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Map {
    public static void main(String[] args) {
        // Kullanıcıya
        // 1-Ekleme
        // 2-Listeleme
        // 3-Arama
        // 4-Düzeltme
        // 5-Çıkış
        // Seçeneklerini vererek username (key),password, userType (Müdür, çalışan) dan oluşan bir Map tanımlayınız.
        // Kullanıcının seçimine göre Her bir işlemi ayrı metodda yaptırınız.
        // Mainde sadece Seçenekler ve metodların çağrılması olsun.

        Scanner scan = new Scanner(System.in);
        Map<String,Map<String,String>> users = new HashMap<>();

        int islem;
        do  {
            menu();
            System.out.println("Bir İşlem Seçin : ");
            islem = scan.nextInt();
            switch (islem) {
                case 1 : ekleme(users);break;
                case 2 : listeleme(users);break;
                case 3 : arama(users);break;
                case 4 : düzeltme(users);break;
            }

        }
        while (islem<5);

    }

    public static void menu() {
        System.out.println("1-Ekleme");
        System.out.println("2-Listeleme");
        System.out.println("3-Arama");
        System.out.println("4-Düzeltme");
        System.out.println("5-ÇIKIŞ");

    }
    public static void ekleme (Map<String,Map<String,String>> users) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> user = new HashMap<>();

        System.out.println("Bir User Name girin : ");
        String name = scan.nextLine();

        System.out.println("Bir password girin : ");
        String pass = scan.nextLine();

        System.out.println("UserType girin : ");
        String type = scan.nextLine();

        user.put(pass, type);
        users.put(name, user);
    }

    public static void listeleme (Map<String,Map<String,String>> users) {}


    public static void arama (Map<String,Map<String,String>> users) {
        Scanner scan = new Scanner(System.in);
        String aranan = scan.nextLine();

        System.out.println(users.containsKey(aranan));
        System.out.println(users.containsValue(aranan));
        System.out.println(users.get("pass").get(aranan));

    }
    public static void düzeltme (Map<String,Map<String,String>> users) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Girmek İstediğiniz İfadeyi Girin  : ");
        String newKey = scan.nextLine();
        String newValue = scan.nextLine();


    }






}
