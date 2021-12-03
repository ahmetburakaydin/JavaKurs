package gun9;

public class IfBlokları {
    public static void main(String[] args) {
        String str = "If ornekler";

        boolean b = str.equals("e");
        boolean c= str.equalsIgnoreCase(" ");
        boolean bb = str.isEmpty();
        boolean a = str.startsWith("e");
        boolean aa = str.endsWith("e");
        boolean cc = str.contains("c");

        int sayi1 = 5;
        int sayi2 = 4;

        boolean sayiBoolean1 = sayi1 ==sayi2;
        boolean sayiBoolean2 = sayi1 !=sayi2;
        boolean sayiBoolean3 = sayi1 > sayi2;
        boolean sayiBoolean4 = sayi1 < sayi2;
        boolean sayiBoolean5 = sayi1 >= sayi2;
        boolean sayiBoolean6 = sayi1 <= sayi2;

        if(sayi1==sayi2){
            System.out.println("İki sayı eşittir.");
        }
        else {
            System.out.println("İki sayı eşit değildir.");
        }

        if(str.endsWith("e")){
            System.out.println("cümle e ile bitiyor.");
        }
        else {
            System.out.println("cümle e ile bitmiyor.");
        }

    }
}
