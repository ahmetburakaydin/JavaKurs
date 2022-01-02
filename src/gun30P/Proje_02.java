package gun30P;

import java.util.*;


public class Proje_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, ArrayList<Integer>> list = new HashMap<>();
        int islem;
        do {
            islem = menu();
            switch (islem){
                case 1:
                    list.put(ogrenciKayit(),new ArrayList<Integer>());
                    break;
                case 2:
                    Scanner scanStr = new Scanner(System.in);
                    System.out.println(list.keySet());
                    System.out.println("Listedeki isimlerinden birini girin");
                    String name = scanStr.nextLine();
                    if(!list.keySet().contains(name)) {
                        System.out.println("Aranan Ogrenci Bulunamadi");
                    }else
                        ogrenciNotGirisi(name,list);
                    break;
                case 3:
                    listeleNotlar(list);
                    break;
                case 4 :
                    listeleOrtalamalar(list);
                    break;
            }
        }while (islem != 0);
    }
    public static int menu(){
        System.out.println("Yapılacak İşlemin Sıra Numarasını Seçin : ");
        System.out.println(" 1 - Yeni Öğrenci Kayıt ");
        System.out.println(" 2 - Not Girişi ");
        System.out.println(" 3 - Öğrenci Notları ");
        System.out.println(" 4 - Not Ortalamaları  ");
        System.out.println(" 0 - Çıkış ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Seçiminiz ? ");
        int islem = scan.nextInt();
        return islem;
    }
    public static String ogrenciKayit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ogrenci ismini girin : ");
        String name = scan.nextLine();
        return isimDuzenle(name);
    }
    public static String isimDuzenle(String name){
        name = name.trim().replaceAll("[ ]+"," ");
        String[] nameArray=name.split(" ");
        String yeniIsim = "";
        for (int i = 0; i < nameArray.length; i++) {
            yeniIsim+= nameArray[i].substring(0,1).toUpperCase(Locale.ROOT)+(nameArray[i].substring(1)).toLowerCase(Locale.ROOT)+" ";
        }
        return yeniIsim.trim();
    }
    public static void ogrenciNotGirisi(String ogrenciAdi, HashMap<String, ArrayList<Integer>> list) {
        Scanner scanInt = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        int not = 0;

        while(true){
            System.out.println("Notu Girin : ");
            not = scanInt.nextInt();
            if(not>= 0 && not <= 100)
                notlar.add(not);
            else {
                list.put(ogrenciAdi,notlar);
                break;
            }

        }
    }

    public static void listeleNotlar(HashMap<String, ArrayList<Integer>> list){
        System.out.println("Öğrenci Notları");
        for (Map.Entry<String,ArrayList<Integer>> nameNot: list.entrySet()) {
            System.out.printf("%-20s",nameNot.getKey());
            for (Integer integer:nameNot.getValue()) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }

    }

    public static void listeleOrtalamalar(HashMap<String, ArrayList<Integer>> list){
        int notToplam=0;
        double dersOrtalama=0;
        int notSayısı=0;
        System.out.println("Ogrenci Not Ortalamaları ");
        for (Map.Entry<String,ArrayList<Integer>> nameNot: list.entrySet()) {
            for (int i = 0; i < nameNot.getValue().size(); i++) {
                notToplam+=nameNot.getValue().get(i);
                notSayısı++;
            }
            dersOrtalama=(double)(notToplam/notSayısı);

            System.out.printf("%.2f",dersOrtalama+", ");
        }
    }
}